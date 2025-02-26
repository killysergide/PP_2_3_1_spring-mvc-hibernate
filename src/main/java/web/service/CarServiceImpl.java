package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Ford", "Mustang", 2021));
        carList.add(new Car("BMW", "X5", 2019));
        carList.add(new Car("Honda", "Civic", 2022));
        carList.add(new Car("Tesla", "Model 3", 2023));
    }

    @Override
    public List<Car> getCars(int count) {

        if (count < 0) {
            count = 0;
        }

        if (count > carList.size()) {
            count = carList.size();
        }

        return carList.subList(0, count);
    }
}
