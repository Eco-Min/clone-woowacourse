package racing_car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing_car.domain.Car;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("공백이 들어오면 예외를 반환")
    public void emptyTest () throws Exception{
        Car car = new Car();
        assertThatThrownBy(() -> car.create(" "))
                .isInstanceOf(IllegalArgumentException.class);
     }

     @Test
     @DisplayName("입력받은 자동차 이름내 공백이 있으면 안됩니다.")
     public void isBlankBesideCarName() throws Exception{
         Car car = new Car();
         assertThatThrownBy(() -> car.create("abc de"))
                 .isInstanceOf(IllegalArgumentException.class);
      }

      @Test
      @DisplayName("자동차 이름은 1자 ~ 5자 사이여야 한다.")
      public void mustHaveUnder5Letter() throws Exception{
          Car car = new Car();
          assertThatThrownBy(() -> car.create("abcdef"))
                  .isInstanceOf(IllegalArgumentException.class);
          assertThatThrownBy(() -> car.create(""))
                  .isInstanceOf(IllegalArgumentException.class);
       }

       @Test
       @DisplayName("시작지점이 0인가?")
       public void startingPoint() throws Exception{
           Car car = new Car();
           car.create("asdfz");
           assertThat(car.getPosition()).isEqualTo(0);
        }

}