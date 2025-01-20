package sixthone;

public class Solution {

    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }

    public static class Screen implements Updatable, Selectable {

        public void refresh() {}
        public void onSelect() {}

    }



}
