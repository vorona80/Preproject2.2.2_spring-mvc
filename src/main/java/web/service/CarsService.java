package web.service;

import web.model.Cars;

import java.util.List;

public interface CarsService {
    List<Cars> retCars();
    List<Cars> countCars(int count);
}
