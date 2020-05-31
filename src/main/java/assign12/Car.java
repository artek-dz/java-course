package assign12;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

import static java.util.stream.Collectors.toList;

@ToString @EqualsAndHashCode @Builder
public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
        this.wheels = wheels.stream()
                .map(wheel -> new Wheel(wheel.getRadius(), wheel.getWidth()))
                .collect(toList());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
    }

    public List<Wheel> getWheels() {
        return wheels.stream()
                .map(wheel -> new Wheel(wheel.getRadius(), wheel.getWidth()))
                .collect(toList());
    }
}



