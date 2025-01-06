import java.util.Scanner;

public class TaskFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter an element in an array: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        int temp;

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
