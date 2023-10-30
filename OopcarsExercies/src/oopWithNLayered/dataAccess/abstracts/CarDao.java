package oopWithNLayered.dataAccess.abstracts;
import java.util.List;

import oopWithNLayered.entities.concretes.Car;

public interface CarDao {
    void add(Car car);
    void update(Car car);
    void delete(Car car);
    Car get(int id);
    List<Car> getAll();
}
