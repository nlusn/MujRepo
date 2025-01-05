public class TaskTwo {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                strArr[i] = "Even";
            }
            else{
                strArr[i] = "Odd";
            }
        }

        for(int i = 0; i < strArr.length; i++){
            System.out.printf("index = %d\nvalue = %s\n",i ,strArr[i]);
        }
    }
}
