import java.util.Random;

public class TaskElf {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][][] multiArray = new int[3][3][3];
        for(int i = 0; i < multiArray.length; i++) {
            for(int j = 0; j < multiArray[i].length; j++) {
                for(int k = 0; k < multiArray[i][j].length; k++) {
                    multiArray[i][j][k] = rand.nextInt(10) + 1;
                }
            }
        }

        for(int i = 0; i < multiArray.length; i++) {
            for(int j = 0; j < multiArray[i].length; j++) {
                for(int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
