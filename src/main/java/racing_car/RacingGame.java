package racing_car;

import java.util.*;
import java.util.stream.Collectors;

public class RacingGame {

    private final RacingRule rule;

    public RacingGame(RacingRule rule) {
        this.rule = rule;
    }

    public List<Car> step(List<Car> cars) {
        for (Car car : cars) {
            if(rule.runningOfRace()) {
                car.addPosition();
            }
        }
        return cars;
    }

    public List<Car> result(List<Car> car) {
        List<Integer> positionList = car.stream().map(Car::getPosition).toList();
        Integer max = Collections.max(positionList);
        List<Car> result = car.stream().filter(item -> item.getPosition() == max).collect(Collectors.toList());
        return result;
    }
}
