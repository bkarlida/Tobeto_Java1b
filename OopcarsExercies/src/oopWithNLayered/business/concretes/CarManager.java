package oopWithNLayered.business.concretes;

import oopWithNLayered.business.abstracts.CarService;
import oopWithNLayered.dataAccess.abstracts.CarDao;
import oopWithNLayered.entities.concretes.Car;

import java.util.List;

public class CarManager implements CarService {
    private CarDao carDao;

    public CarManager(CarDao carDao)
    {
        this.carDao = carDao;
    }


    @Override
    public void add(Car car) {
        List <Car> cars = carDao.getAll();
        int count = 0;

        for (Car carName : cars) {
            if (carName.getId() == car.getId()) {
                System.out.println(car.getName() + "eklenemedi. Tekrar deneyiniz.");
                return;
            }
            if (car.getCategoryId() == carName.getCategoryId()) {
                count++;
                if (count > 3) {
                    System.out.println("Aynı kategoriden en fazla 3 tane araba olur.");
                    return;
                }
            }
        }

        this.carDao.add(car);
    }

}
