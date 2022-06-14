package racing_car.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CarFactory {

    private final String cars;
    private final List<Car> carList;

    public CarFactory(String cars) {
        this.cars = cars;
        this.carList = new ArrayList<>();
    }

    public List<Car> createCar() {
        Set<String> splitCar = givenEachCarName();
        for (String s : splitCar) {
            Car car = new Car();
            car.create(s);
            carList.add(car);
        }
        return carList;
    }

    private Set<String> givenEachCarName() {
        String[] split = getCars().split(",");
        Set<String> splitCar = Set.of(split);
        checkDuplicate(split, splitCar);
        return splitCar;
    }

    private void checkDuplicate(String[] split, Set<String> splitCar) {
        if (split.length != splitCar.size()) {
            throw new IllegalArgumentException("중복되는 문제 발생");
        }
    }

    public String getCars() {
        return cars;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
