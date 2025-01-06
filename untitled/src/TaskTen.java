import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number greater than or equal to 0: ");

        int n = sc.nextInt();

        while (n < 0) {
            System.out.println("Enter the number greater than or equal to 0: ");
            n = sc.nextInt();
        }

        int[][] multiArray = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an array element: ");
            int size = sc.nextInt();
            if(size < 0){
                System.out.print("Enter the number greater than or equal to 0: ");
            }
            else{
                multiArray[i] = new int[size];
            }


        }

        for (int i = 0; i < multiArray.length; i++) {
            if (multiArray[i].length == 0) {
                System.out.println(" ");
            } else {
                for (int j = 0; j < multiArray[i].length; j++) {
                    System.out.print("[]");
                }
            System.out.println();
            }

        }





    }
}
