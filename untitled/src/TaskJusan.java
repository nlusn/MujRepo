import java.util.Scanner;

public class TaskJusan {
    public static void main(String[] args) {
        int[][] multiArr = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter array element " + i + " and " + j + ": ");
                multiArr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        int temp1= 0;
        int temp2 = 0;
        int max = multiArr[0][0];
        for (int i = 1; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i][j] > max) {
                    max = multiArr[i][j];
                    temp1 = i;
                    temp2 = j;
                }
            }
        }
        System.out.printf("the maximum element is %d on position %d %d ",max,temp1,temp2);




    }
}
