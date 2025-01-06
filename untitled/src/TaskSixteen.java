import java.util.Scanner;
import java.util.Random;

public class TaskSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of a pyramid: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 2; j <= height-i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i*2 - 1; k++) {
                System.out.print("#");
            }
            System.out.println();

        }




    }
}
