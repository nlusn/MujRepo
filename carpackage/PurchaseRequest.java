package carpackage;

public class PurchaseRequest {
    private String customerName;
    private Car car;

    public PurchaseRequest(String customerName, Car car) {
        this.customerName = customerName;
        this.car = car;
        car.addPurchaseRequest(this);
    }

    public void display() {
        System.out.println("Purchase Request by " + customerName + " for " + car.getBrand());
    }
}

