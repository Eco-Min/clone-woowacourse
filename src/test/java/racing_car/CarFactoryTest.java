package racing_car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing_car.domain.Car;
import racing_car.domain.CarFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarFactoryTest {

    @Test
    @DisplayName("자동차들은 , 로 구분뒤어야 하며 마지막 , 는 출력 X 한다.")
    public void seperatedCar() throws Exception{
        CarFactory factory = new CarFactory("a,b,c,d,e,");
        List<Car> cars = factory.createCar();
        List<String> carNames = cars.stream().map(Car::getName).toList();
        for (String carName : carNames) {
            assertThat(carName).doesNotContain(",");
        }
    }

    @Test
    @DisplayName("중복된 자동차가 존재할 수 없다.")
    public void canNotDuplicatedCar() throws Exception{
        CarFactory factory = new CarFactory("a,a,c,d,e,");
        assertThatThrownBy(factory::createCar)
                .isInstanceOf(IllegalArgumentException.class);
     }

}