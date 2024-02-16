package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceImpl {
    List<Car> listOfCars(int count);
}
