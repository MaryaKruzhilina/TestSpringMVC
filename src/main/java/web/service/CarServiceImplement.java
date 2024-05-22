package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImplement implements CarService{

    private final CarDAO carDAO;

    public CarServiceImplement(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCarsList(Integer count) {
        return carDAO.getCarsList(count);
    }
}
