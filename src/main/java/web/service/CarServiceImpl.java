package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public ArrayList<Car> getSomeCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw", 240, 5000000));
        cars.add(new Car("lada", 140, 500000));
        cars.add(new Car("kia", 200, 1500000));
        return cars;
    }
}