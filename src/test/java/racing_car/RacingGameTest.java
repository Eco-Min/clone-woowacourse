package racing_car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class RacingGameTest {

    @Test
    @DisplayName("각 자동차 별로 전진여부 결정")
    public void decideCarMove() throws Exception{
        CarFactory factory = new CarFactory("a,b,c,d,e,");
        List<Car> cars = factory.createCar();
        RacingRule rule = new FirstRacingRule();
        RacingGame racingGame = new RacingGame(rule);
        racingGame.step(cars);
        for (Car car : cars) {
            System.out.println("car = " + car.getPosition());
        }
    }
}