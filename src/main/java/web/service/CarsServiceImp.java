package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Cars;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarsServiceImp implements CarsService {
    private List<Cars> car = new ArrayList<>();
    {
        car = new ArrayList<>();
        car.add(new Cars("Mazda","6","white"));
        car.add(new Cars("Mazda","5","red"));
        car.add(new Cars("Mazda","3","black"));
        car.add(new Cars("BMV","525","blue"));
        car.add(new Cars("BMV","X6","black"));
    }
    public List<Cars> retCars () {
        return car;
    }
    public List<Cars> countCars (int count) {
        return car.stream().limit(count).toList();
    }
}
