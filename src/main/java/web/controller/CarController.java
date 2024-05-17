package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {
    @GetMapping(value = "/")
    public String printCars(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "FV340", 1999));
        cars.add(new Car("LADA", "QP752", 2015));
        cars.add(new Car("NISSAN", "LK809", 2020));
        model.addAttribute("cars", cars);
        return "index";
    }
}
