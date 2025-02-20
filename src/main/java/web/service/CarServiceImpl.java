package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();

    public CarServiceImpl() {
        carList.add(new Car(1, "Toyota", "green"));
        carList.add(new Car(2, "Honda", "black"));
        carList.add(new Car(3, "Ford", "white"));
        carList.add(new Car(4, "BMW", "red"));
        carList.add(new Car(5, "Mercedes", "blue"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
