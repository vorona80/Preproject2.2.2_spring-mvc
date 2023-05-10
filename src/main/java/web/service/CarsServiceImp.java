package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarsDaoImp;
import web.model.Cars;

import java.util.List;
@Component
public class CarsServiceImp implements CarsService {

    @Autowired
    CarsDaoImp carDao;
    public List<Cars> countCars (int count) {
        return carDao.countCars(count);
    }
}
