package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarListService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller

public class CarController {
    @Autowired
    private CarListService service;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("cars_list", service.getCarsList(count));
        return "cars";
    }
}
