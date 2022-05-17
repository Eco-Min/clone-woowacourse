package racing_car;

import java.util.Scanner;

public class Controller {

    private final RacingGameService racingGameService;

    public Controller(RacingGameService racingGameService) {
        this.racingGameService = racingGameService;
    }

    public void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 를 입력하세요 ex)abc,def,ghi,\n");
        String cars = scanner.next();
        System.out.println("시도 횟수를 입력 하세요 ex) 5 \n");
        int tryCount = scanner.nextInt();

        racingGameService.service(cars, tryCount);
    }
}
