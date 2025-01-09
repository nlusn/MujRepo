public class task5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
    }
    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");

        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
