package testsixteen;


public class Car {
    private String model;
    private int year;
    private String color;


    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public void displayCar() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.initialize("Tesla Model S", 2024, "Red");
        myCar.displayCar();
    }
}
