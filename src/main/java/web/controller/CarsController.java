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
    private CarsService carsService;
    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }
    @GetMapping("")
    public String returnCar(@RequestParam(value = "count",defaultValue = "5"/*required = false*/) String count, Model model) {
        model.addAttribute("result", carsService.countCars(Integer.parseInt(count)));
        return "cars";
    }
}
