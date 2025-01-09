public class Task11 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(array[i]);
            System.out.printf("The square root of the number %d is %f\n" , element, elementSqrt);
        }
    }


}
