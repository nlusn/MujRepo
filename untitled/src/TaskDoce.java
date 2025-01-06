import java.util.Random;

public class TaskDoce {
    public static void main(String[] args) {
        Random r = new Random();

        int[][] multiArray = new int[2][3];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = r.nextInt(10)+1;
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]+" ");
            }
            System.out.println();
        }



    }
}
