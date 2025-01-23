package testthirteen;

public class Hedgehog {

    public void eat(Apple apple) {System.out.println("The apple has been eaten!");}

    public static void main(String[] args) {
        Hedgehog h = new Hedgehog();
        h.eat(new Apple());

    }

    public static class Apple {}

}
