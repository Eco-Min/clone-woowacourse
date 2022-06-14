package racing_car.service;

import racing_car.domain.FirstRacingRule;
import racing_car.domain.RacingRule;
import racing_car.domain.Car;
import racing_car.domain.CarFactory;

import java.util.List;

public class RacingGameService {
    private static CarFactory factory;
    private final RacingGame racingGame;

    public RacingGameService() {
        RacingRule rule = new FirstRacingRule();
        this.racingGame = new RacingGame(rule);
    }

    public void insertCarFactory(String cars){
        factory = new CarFactory(cars);
        factory.createCar();
    }

    public List<Car> play() {
        List<Car> carList = factory.getCarList();
        return racingGame.proceed(carList);
    }

    public List<Car> result() {
        return this.racingGame.result(factory.getCarList());
    }
}
