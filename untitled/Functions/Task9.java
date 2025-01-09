public class Task9 {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov");

        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }

    public static class Person {
        private String firstName;
        private String lastName;

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        protected String getFirstName() { // No change needed, already accessible.
            return firstName;
        }

        public String getLastName() { // Changed to public.
            return lastName;
        }

        public String getFullName() { // Changed to public.
            return firstName + " " + lastName;
        }
    }
}
