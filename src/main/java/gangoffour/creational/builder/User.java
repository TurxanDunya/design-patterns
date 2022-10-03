package gangoffour.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Builder pattern aims to:
 * “Separate the construction of a complex object from its representation so that
 * the same construction process can create different representations.”
 *
 * It is used to construct a complex object step by step and the final step will return the object
 */
public class User {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    // Notice that SET methods are private
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + "," + " age=" + age;
    }

    // Get builder instance. Notice this method is static.
    // When we call builder(), we create inner class object actually.
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // Inner class stores data in. And in the last step, it sets all data to our base class.
    public static class UserBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private User user;

        public UserBuilder firstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserBuilder lastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserBuilder birthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public User build() {
            this.user = new User();
            user.setName(firstName + " " + lastName);
            user.setAge(age);
            return this.user;
        }

        public User getUser() {
            return this.user;
        }
    }
}