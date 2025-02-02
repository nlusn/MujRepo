package carpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create dealership
        CarDealership dealership = new CarDealership("Super Cars");

        // Create cars
        Car car1 = new Car("Toyota", "Camry", 3);
        Car car2 = new Car("Honda", "Civic", 2);

        // Add cars to dealership
        dealership.addCar(car1);
        dealership.addCar(car2);

        // Create purchase requests
        PurchaseRequest request1 = new PurchaseRequest("Alice", car1);
        PurchaseRequest request2 = new PurchaseRequest("Bob", car2);
        PurchaseRequest request3 = new PurchaseRequest("Charlie", car2);
        PurchaseRequest request4 = new PurchaseRequest("David", car2);

        // Display dealership details
        dealership.display();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car name: ");
        String carName = scanner.nextLine();


        // Search for a car
        Car foundCar = dealership.searchCarByBrand(carName);
        if (foundCar != null) {
            System.out.println("Found Car:");
            foundCar.display();
        } else {
            System.out.println("Car not found.");
        }
    }
}

