package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

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
        return cars.stream().limit(Math.min(count, limitCount)).toList();
    }
}
