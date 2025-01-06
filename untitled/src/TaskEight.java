public class TaskEight {
    public static void main(String[] args) {
        int[][] multiTable = new int[10][10];


        for (int i = 1; i < multiTable.length ; i++) {
            for (int j = 1; j < multiTable[i].length; j++) {
                multiTable[i][j] = i*j;
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < multiTable[0].length ; i++) {
            System.out.print(10*i + " ");
        }
    }
}
