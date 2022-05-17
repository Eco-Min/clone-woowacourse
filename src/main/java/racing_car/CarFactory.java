package racing_car;

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
        Set<String> splitCar = isValid();
        for (String s : splitCar) {
            Car car = new Car();
            car.create(s);
            carList.add(car);
        }
        return carList;
    }

    private Set<String> isValid() {
        String[] split = getCars().split(",");
        Set<String> splitCar = Set.of(split);
        if (split.length != splitCar.size()) {
            throw new IllegalArgumentException("중복되는 문제 발생");
        }
        return splitCar;
    }

    public String getCars() {
        return cars;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
