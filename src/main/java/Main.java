import Builder.Person;

public class Main {
    public static void main(String[] args) {
        Person newPerson = new Person.Builder()
                .firstName("John")
                .lastName("John")
                .country("Canada")
                .age(30)
                .gender("M")
                .build();
    }
}

