package web.DAO;

import web.model.Cars;

import java.util.List;

public interface CarsDao {
    List<Cars> countCars (int count);
}
