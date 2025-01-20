package eleventhpackage;

public class Solution {

    static class Dog implements Moveable, CanEat{
        public void eat(){}
        public void move(){}
    }

    static class Cat implements Moveable,Eatable,CanEat{
        @Override
        public void move() {}
        public void eat(){}
        public void eatable(){}
    }

    static class Mouse implements Moveable, Eatable{
        public void move() {}
        public void eatable(){}
    }

    interface Moveable {public void move();}
    interface Eatable {public void eatable();}
    interface CanEat { public void eat();}




}
