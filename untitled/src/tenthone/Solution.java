package tenthone;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss {
        @Override
        public void use(Person person) {
            person.startToWork();
        }

        @Override
        public void startToWork() {
        }

        @Override
        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        @Override
        public void use(Person person) {
        }

        @Override
        public void startToWork() {
        }
    }
}
