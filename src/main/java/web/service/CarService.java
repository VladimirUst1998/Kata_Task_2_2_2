package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService implements CarServiceImpl {

    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 111));
        cars.add(new Car("Toyota", "Camry", 777));
        cars.add(new Car("Lexus", "ES350", 999));
        cars.add(new Car("Kia", "Stinger", 333));
        cars.add(new Car("Lexus", "IS350", 174));
    }

    @Override
    public List<Car> listOfCars(int count) {
        int limitCount = 5;
        if (count < limitCount) {
            return cars.stream().limit(count).toList();
        } else {
            return cars.stream().limit(limitCount).toList();
        }
    }
}
