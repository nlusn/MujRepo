package testfourteen;

public class Solution {

    public static void showWeather(City city) {
        System.out.printf("In the city of %s today, the temperature is %d",city.getName(),city.getTemperature());
    }

    public static void main(String[] args) {

        City newCity = new City("Astana",-10);
        showWeather(newCity);

    }


}
