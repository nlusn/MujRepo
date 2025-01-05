import java.util.Arrays;
import java.util.Scanner;


public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a word: ");
            arr[i] = scanner.next();
        }



        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] != null && arr[i].equalsIgnoreCase(arr[j])){
                    arr[i] = null;
                    arr[j] = null;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
