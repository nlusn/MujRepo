package carpackage;

import java.util.ArrayList;

public class CarDealership {
    private String name;
    private ArrayList<Car> cars;

    public CarDealership(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        car.setCarDealership(this);
    }

    public Car searchCarByBrand(String brand) {
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                return car;
            }
        }
        return null;
    }

    public void display() {
        System.out.println("Car Dealership: " + name);
        for (Car car : cars) {
            car.display();
        }
    }

    public String getName() {
        return name;
    }
}

