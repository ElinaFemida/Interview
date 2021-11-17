package Builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder firstName(String firstName) {
            newPerson.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            newPerson.lastName = lastName;
            return this;
        }

        public Builder middleName(String middleName) {
            newPerson.middleName = middleName;
            return this;
        }

        public Builder country(String country) {
            newPerson.country = country;
            return this;
        }

        public Builder address(String address) {
            newPerson.address = address;
            return this;
        }

        public Builder phone(String phone) {
            newPerson.phone = phone;
            return this;
        }

        public Builder age(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder gender(String gender) {
            newPerson.gender = gender;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
