package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "en") String locale, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.getSomeCars();
        model.addAttribute("cars", cars);
        if (locale.equals("ru")) {
            model.addAttribute("locale", "МАШИНЫ");
        } else if (locale.equals("en")) {
            model.addAttribute("locale", "CARS");
        }
        return "cars";
    }
}