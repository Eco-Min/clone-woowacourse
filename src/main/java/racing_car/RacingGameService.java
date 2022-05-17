package racing_car;

import java.util.List;

public class RacingGameService {
    public void service(String cars, int tryCount) {
        CarFactory factory = new CarFactory(cars);
        RacingRule rule = new FirstRacingRule();
        RacingGame racingGame = new RacingGame(rule);
        List<Car> car = factory.createCar();
        for (int i = 0; i < tryCount; i++) {
            racingGame.step(car);
            for (Car car1 : car) {
                System.out.println("car1.getPosition() = " + car1.getPosition());
                System.out.println("car1.getName() = " + car1.getName());
            }
        }
        result(car, racingGame);
    }

    private void result(List<Car> car, RacingGame racingGame) {
        System.out.println("Racing Game 결과 입니다.");
        List<Car> result = racingGame.result(car);
        for (Car car1 : result) {
            System.out.println("car1.getName() = " + car1.getName());
            System.out.println("car1.getPosition() = " + car1.getPosition());
        }
    }
}
