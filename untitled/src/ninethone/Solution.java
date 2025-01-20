package ninethone;

public class Solution {

    interface CanMove{
        public Double speed();
    }

    interface CanFly extends CanMove{
        public Double speed(CanFly variable);
    }





}
