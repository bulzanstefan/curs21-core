package ro.fasttrackit.curs21.curs21;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Constructed car with engine " + engine);
    }

    public void start() {
        engine.throttleUp();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
