package carpackage;

import java.util.ArrayList;

public class Car {
    private String brand;
    private String model;
    private int stock;
    private CarDealership carDealership;
    private ArrayList<PurchaseRequest> purchaseRequests;

    public Car(String brand, String model, int stock) {
        this.brand = brand;
        this.model = model;
        this.stock = stock;
        this.purchaseRequests = new ArrayList<>();
    }

    public void addPurchaseRequest(PurchaseRequest request) {
        purchaseRequests.add(request);
    }

    public void removePurchaseRequest(PurchaseRequest request) {
        purchaseRequests.remove(request);
    }

    public boolean isAvailable() {
        return stock > purchaseRequests.size();
    }

    public void display() {
        System.out.println("Car: " + brand + " " + model + ", Stock: " + stock + ", Available: " + isAvailable());
    }

    public String getBrand() {
        return brand;
    }

    public void setCarDealership(CarDealership dealership) {
        this.carDealership = dealership;
    }
}
