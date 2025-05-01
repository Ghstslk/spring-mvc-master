package web.Services;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> cars =  Arrays.asList(
            new Car("Tesla","Gray",2019),
            new Car("Toyota","Blue",2001),
            new Car("Suzuki","Red",2002),
            new Car("Mitsubishi","Green", 1998),
            new Car("Mercedes","Black", 2007)
    );

    public List<Car> getCars(int count) {
        if (count > cars.size()) { return cars; }
        return cars.subList(0, count);
    }
}
