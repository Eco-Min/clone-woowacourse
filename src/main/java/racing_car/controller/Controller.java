package racing_car.controller;

import racing_car.service.RacingGameService;
import racing_car.domain.Car;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private final RacingGameService racingGameService;

    public Controller() {
        racingGameService = new RacingGameService();
    }

    public void call() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 를 입력하세요 ex)abc,def,ghi,\n");
        String cars = scanner.next();
        System.out.println("시도 횟수를 입력 하세요 ex) 5 \n");
        int tryCount = scanner.nextInt();

        racingGameService.insertCarFactory(cars);
        for (int i = 0; i < tryCount; i++) {
            List<Car> carList = racingGameService.play();
            for (Car car : carList) {
                System.out.println("car.getName() = " + car.getName());
                System.out.println("car.getPosition() = " + car.getPosition());
            }
            System.out.println("--------------------------------------------------");
        }
        System.out.println("===============================================================");
        List<Car> result = racingGameService.result();
        for (Car car : result) {
            System.out.println("car.getName() = " + car.getName());
            System.out.println("car.getPosition() = " + car.getPosition());
        }
    }
}
