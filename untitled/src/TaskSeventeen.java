import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("Enter board element: ");
                board[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board.length - 1; j++) {
                board[i][j] = '-';
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }
}
