import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] multiArray = new int[3][3];
        int[] rowArr = new int[3];
        int[] colArr = new int[3];


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("Enter array element for the row number " + i + " and column number " + j + ": ");
                multiArray[i][j] = scan.nextInt();
                rowArr[i] += multiArray[i][j];
                colArr[j] += multiArray[i][j];
            }
            System.out.println();
        }

        int minRow = rowArr[0];
        int minCol = colArr[0];


        for (int i = 0; i < rowArr.length; i++) {
            System.out.print(rowArr[i] + " ");
            if(rowArr[i] < minRow) {
                minRow = rowArr[i];
            }
        }

        System.out.println();

        for (int i = 0; i < colArr.length; i++) {
            System.out.print(colArr[i] + " ");
            if(colArr[i] < minCol) {
                minCol = colArr[i];
            }
        }

        System.out.println();
        System.out.printf("The minimum element for row is %d \n", minRow);
        System.out.printf("The minimum element for column is %d \n", minCol);

        scan.close();


    }
}
