package racing_car;

import java.util.Random;

public class FirstRacingRule implements RacingRule {

    @Override
    public boolean runningOfRace() {
        Random random = new Random();
        int randomValue = random.nextInt(9);
        return randomValue >= 4;
    }
}
