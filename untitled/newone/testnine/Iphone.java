public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }


        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast obj to Iphone and compare field values
        Iphone otherIphone = (Iphone) obj;
        return model.equals(otherIphone.model) &&
                color.equals(otherIphone.color) &&
                price == otherIphone.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2)); // This will now return true
    }
}
