import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        while (n <= 0){
            System.out.println("Enter the size of the array: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element: ");
            arr[i] = scanner.nextInt();
        }


        System.out.println("The array is: ");
        if(n % 2 != 0){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for (int i = n-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
