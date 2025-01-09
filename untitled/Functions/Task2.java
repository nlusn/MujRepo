public class Task2 {
    public static void main(String[] args){
        System.out.println("Hello from me to y'all");
        System.out.println("I am a poet");

        printLines("Wolf is a cool animal", 10);
        printPersonalInfo("Arslan","Arslanuly","Beshparmaq");


    }


    public static void printLines(String text, int count){

        for(int i = 0; i < count; i++){
            System.out.println(text);
        }


    }

    public static void printPersonalInfo(String name, String surname, String meal){
        System.out.println("Brief Dossier:");
        System.out.println("Name: " + name);
        System.out.println("LastName: " + surname);
        System.out.println("Favorite dish: " + meal);

    }


}
