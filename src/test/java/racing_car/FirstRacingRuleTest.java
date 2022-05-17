package racing_car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FirstRacingRuleTest {

    @Test
    @DisplayName("값에 따라 자동차 전진 4이상 전진 3이하 스톱")
    public void decideCarMove() throws Exception{
        FirstRacingRule rule = new FirstRacingRule();
        assertThat(rule.runningOfRace()).isTrue();
     }

}