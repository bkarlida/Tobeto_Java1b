package oopWithNLayered.dataAccess.concretes;

import oopWithNLayered.dataAccess.abstracts.CarDao;
import oopWithNLayered.entities.concretes.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCarDao implements CarDao {
    protected List<Car> carList;

    public BaseCarDao() {
        carList = new ArrayList<>();
    }

    @Override
    public void add(Car car) {
        System.out.println("Car eklendi: " + car.getName());
        carList.add(car);
    }

    @Override
    public void update(Car car) {
        System.out.println("Car güncellendi: " + car.getName());
    }

    @Override
    public void delete(Car car) {
        System.out.println("Car silindi: " + car.getName());
        carList.remove(car);
    }

    @Override
    public Car get(int id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }
}
