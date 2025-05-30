package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        Car car1 = new Car(1, "model 1", 1900);
        Car car2 = new Car(2, "model 2", 1960);
        Car car3 = new Car(3, "model 3", 2000);
        Car car4 = new Car(4, "model 4", 2010);
        Car car5 = new Car(5, "model 5", 2020);
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    public List<Car> getCars(Integer i) {
        if (i == null) return getCarsList();

        return new ArrayList<>(carsList.subList(0, Math.min(i, carsList.size())));
    }
}


