package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarListService {
    private List<Car> carsList = new ArrayList<>();

    public CarListService() {
        carsList.add(new Car("BMW", "FV340", 1999));
        carsList.add(new Car("LADA", "QP752", 2015));
        carsList.add(new Car("NISSAN", "LK809", 2020));
        carsList.add(new Car("AURUS", "OB736", 1987));
        carsList.add(new Car("AUDI", "AD586", 2024));
    }

    public List<Car> getCarsList(Integer count) {
        List<Car> result = new ArrayList<>();
        if(count != null && count < carsList.size()) {
            for (int i = 0; i<count; i++) {
                result.add(carsList.get(i));
            }
        } else {
            result = carsList;
        }
        return result;
    }
}
