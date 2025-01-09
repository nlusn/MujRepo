public class Task4 {
    public class entity{
        public void move(){
            System.out.println("I am moving");
        }

        public void eat(){
            System.out.println("I am eating");
        }

    }
    public class human extends entity{
        public void speak(){
            System.out.println("I can communicate");
        }
    }
    public class JavaDeveloper extends human{
        public void code(){
            System.out.println("I know how to communicate in Java.");
        }
    }




}
