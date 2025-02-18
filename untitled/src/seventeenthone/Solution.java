package seventeenthone;

public class Solution {
    public static void main(String[] args) throws Exception {
        BigFox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        String getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public String getName() {
            return "BigFox";
        }

        @Override
        public String getColor() {
            return "Red";
        }
    }
}
