package assign12;

import java.util.Arrays;
import java.util.List;

public class CarTest {

    public static Car createCar() {
        Engine engine = Engine.builder()
                .type("hydrogen-powered engine")
                .horsePower(151)
                .volume(50)
                .build();
        Wheel[] wheels = new Wheel[5];
        Arrays.setAll(wheels, i -> new Wheel(40 + i, 15 + i));
        Car car = Car.builder()
                .manufacturer("Toyota")
                .manufacturer("Mirai")
                .engine(engine)
                .wheels(List.of(wheels))
                .build();
        return car;
    }

    public static void main(String[] args) {
        Car car = createCar();
        System.out.println(car.getEngine().getHorsePower());
        car.getEngine().setHorsePower(140);
        System.out.println(car.getEngine().getHorsePower());

        System.out.println(car.getWheels());
        car.getWheels().get(0).setRadius(0);
        System.out.println(car.getWheels());
    }
}
