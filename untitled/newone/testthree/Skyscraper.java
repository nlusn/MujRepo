package testthree;

public class Skyscraper {

    private int floorsCount;
    private String developer;

    public Skyscraper(){
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Skyscraper with " + floorsCount + " floors built by " + developer + ".");
    }

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;  // Corrected: Assigning parameters to instance variables
        this.developer = developer;
        System.out.println("Skyscraper with " + floorsCount + " floors built by " + developer + ".");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50,"Unknown");
    }



}
