package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    private CarsService carsService;
    @GetMapping("")
    public String returnCar(@RequestParam(value = "count",required = false) String count, Model model) {
        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("result", carsService.retCars());
        } else {
            model.addAttribute("result", carsService.countCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
