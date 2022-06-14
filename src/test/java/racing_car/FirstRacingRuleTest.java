package racing_car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing_car.domain.RacingRule;

import static org.assertj.core.api.Assertions.*;

class FirstRacingRuleTest {

    RacingRule rule = new SpyRacingRule();

    @Test
    @DisplayName("값에 따라 자동차 전진 4이상 전진")
    public void decideCarMove() throws Exception{
        assertThat(rule.runningOfRace()).isTrue();
     }

     class SpyRacingRule implements RacingRule{

         @Override
         public boolean runningOfRace() {
             return true;
         }
     }

}