package main.java.inherit;

/**
 * Author: Ali Khosravani.
 * Date: 29-04-2023
 * Desc: create Person class.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person() {}

    public String fullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
