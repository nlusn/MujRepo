package testtwo;

public class Skyscraper {

    public Skyscraper() {
        System.out.println("The skyscraper is built.");
    }

    public Skyscraper(int floors) {
        System.out.printf("The skyscraper is built. The number of floors is %d", floors);
    }

    public Skyscraper(String author) {
        System.out.printf("Skyscraper is built. Developer is %s", author);
    }



    public static void main(String[] args) {

        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraper2 = new Skyscraper(60);
        Skyscraper skyscraper3 = new Skyscraper("Elon Musk");

        System.out.println(skyscraper + "\n" +  skyscraper2 + "\n" + skyscraper3);



    }


}
