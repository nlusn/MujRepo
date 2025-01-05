public class TaskFour {
    public static void main(String[] args){
        int[] firstArray = {0,1,2,2,3,4,5,6,7,8,9};
        int[] secondArray = {10,11,12,13,14,15,16,17,18,19};
        int lengthResult = firstArray.length + secondArray.length;
        int[] resultArray = new int[lengthResult];

        for (int i = 0; i < lengthResult; i++) {
            if(i < firstArray.length) {
                resultArray[i] = firstArray[i];
            }
            else{
                resultArray[i] = secondArray[i-firstArray.length];
            }
        }

        for(int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
