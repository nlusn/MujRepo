import java.util.Random;

public class TaskNine {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = 10;
        int b = 10;


        int[][] arr = new int[a][b];

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = i + j;
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
