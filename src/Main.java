import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PurchaseRequest {
    private String buyerName;
    private String phoneNumber;

    public PurchaseRequest(String buyerName, String phoneNumber) {
        this.buyerName = buyerName;
        this.phoneNumber = phoneNumber;
    }
}

class Car {
    private String brand;
    private int maxPassengers;
    private double cost;
    private int quantity;
    private boolean availability;
    private CarShowroom dealership;
    private List<PurchaseRequest> requests;

    public Car(String brand, int maxPassengers, double cost, int quantity) {
        this.brand = brand;
        this.maxPassengers = maxPassengers;
        this.cost = cost;
        this.quantity = quantity;
        this.availability = quantity > 0;
        this.requests = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateAvailability();
    }

    public void addRequest(PurchaseRequest request) {
        requests.add(request);
    }

    public void removeRequest(PurchaseRequest request) {
        requests.remove(request);
    }

    public void updateAvailability() {
        this.availability = quantity > requests.size();
    }

    public void setDealership(CarShowroom dealership) {
        this.dealership = dealership;
    }

    @Override
    public String toString() {
        return brand + "," + maxPassengers + "," + cost + "," + quantity + "," + availability;
    }

    public static Car fromString(String line) {
        String[] parts = line.split(",");
        String brand = parts[0];
        int maxPassengers = Integer.parseInt(parts[1]);
        double cost = Double.parseDouble(parts[2]);
        int quantity = Integer.parseInt(parts[3]);
        return new Car(brand, maxPassengers, cost, quantity);
    }
}

class CarShowroom {
    private String name;
    private List<Car> cars;
    private final String fileName = "cars.txt";

    public CarShowroom(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
        loadCarsFromFile();
    }

    public void addCar(Car car) {
        car.setDealership(this);
        cars.add(car);
        saveCarsToFile();
    }

    public void removeCar(Car car) {
        cars.remove(car);
        saveCarsToFile();
    }

    public void removeAllCars() {
        cars.clear();
        saveCarsToFile();
    }

    public List<Car> searchByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void updateCar(String brand, Scanner scanner) {
        List<Car> carsToUpdate = searchByBrand(brand);
        if (carsToUpdate.isEmpty()) {
            System.out.println("No cars found with this brand.");
            return;
        }

        Car car = carsToUpdate.get(0);
        System.out.print("Enter new max passengers: ");
        int newMaxPassengers = scanner.nextInt();
        System.out.print("Enter new cost: ");
        double newCost = scanner.nextDouble();
        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();

        car.setMaxPassengers(newMaxPassengers);
        car.setCost(newCost);
        car.setQuantity(newQuantity);
        saveCarsToFile();
        System.out.println("Car updated successfully.");
    }

    private void loadCarsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cars.add(Car.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading cars from file.");
        }
    }

    private void saveCarsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving cars to file.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarShowroom showroom = new CarShowroom("Cars");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Remove all cars");
            System.out.println("4. Search for a car by brand");
            System.out.println("5. Display all cars");
            System.out.println("6. Update a car");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter car brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter max passengers: ");
                    int maxPassengers = scanner.nextInt();
                    System.out.print("Enter car cost: ");
                    double cost = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Car car = new Car(brand, maxPassengers, cost, quantity);
                    showroom.addCar(car);
                    System.out.println("Car added successfully.");
                    break;

                case 2:
                    System.out.print("Enter car brand to remove: ");
                    String brandToRemove = scanner.nextLine();
                    List<Car> carsToRemove = showroom.searchByBrand(brandToRemove);
                    if (!carsToRemove.isEmpty()) {
                        showroom.removeCar(carsToRemove.get(0));
                        System.out.println("Car removed successfully.");
                    } else {
                        System.out.println("Car not found.");
                    }
                    break;

                case 3:
                    showroom.removeAllCars();
                    System.out.println("All cars removed.");
                    break;

                case 4:
                    System.out.print("Enter brand name to search: ");
                    String brandToSearch = scanner.nextLine();
                    List<Car> foundCars = showroom.searchByBrand(brandToSearch);
                    if (!foundCars.isEmpty()) {
                        for (Car foundCar : foundCars) {
                            System.out.println("Found - " + foundCar);
                        }
                    } else {
                        System.out.println("No cars found for the specified brand.");
                    }
                    break;

                case 5:
                    showroom.displayCars();
                    break;

                case 6:
                    System.out.print("Enter brand of the car to update: ");
                    String brandToUpdate = scanner.nextLine();
                    showroom.updateCar(brandToUpdate, scanner);
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
