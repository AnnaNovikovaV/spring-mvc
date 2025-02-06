package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    @Override
    public void add(Car car) {
        carList.add(new Car(1, "Mercedes-Benz GLK 200", "серебристый"));
        carList.add(new Car(2, "Mercedes-Benz GLK 220", "черный"));
        carList.add(new Car(3, "Mercedes-Benz GLK 300", "красный"));
        carList.add(new Car(4, "Mercedes-Benz GLK 350", "синий"));
        carList.add(new Car(5, "Mercedes-Benz GLK 400", "коричневый"));
    }
}
