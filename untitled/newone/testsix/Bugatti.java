package testsix;

public class Bugatti {
    private String color = "Black";
    private int year = 2020;
    private String body = "Coupe";


    public Bugatti(String color, int year, String body) {

        this.color = color;
        this.year = year;
        this.body = body;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



}
