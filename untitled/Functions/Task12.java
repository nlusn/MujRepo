public class Task12 {

    static class LargestCity{
        static String city = "Tokyo";
        static double population = 34.5;
    }

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of the city " + city + " is " + population + " million people.");
        System.out.println("While the most populous city " + LargestCity.city + " has a population of " + LargestCity.population + " million people.");
    }





}
