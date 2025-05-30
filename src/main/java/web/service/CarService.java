package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsList();
    List<Car> getCars(Integer i);
}
