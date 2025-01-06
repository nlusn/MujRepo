import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = scanner.nextInt();
        }


        int max = arr[0];
        for (int i = 0; i < N; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
