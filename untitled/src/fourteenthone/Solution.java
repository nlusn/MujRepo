package fourteenthpackage;

public class Solution {

    interface Desire{
        ;
    }

    interface Dream{
        public static Hobby HOBBY = new Hobby();
    }


    static class Hobby implements Desire, Dream{
        static int INDEX=1;

        public String toString(){
            INDEX++;
            return "";
        }
    }


}
