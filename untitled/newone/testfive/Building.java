package testfive;

public class Building {
    private String type;

    public void initialize(String places) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Building b = new Building();
        b.initialize("Restraunt");
        b.initialize("Barbershop");

        System.out.println(b.getType());
    }


}
