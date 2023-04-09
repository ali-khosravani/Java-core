package test.java.inherit;

import main.java.inherit.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import main.java.inherit.Person;

class PersonTest {
    Person person =new Person();
    @Test
    void getFirstName() {
        person.setFirstName("Ali");
        String firstName =  person.getFirstName();
        Assertions.assertEquals("Ali" , firstName);
    }

    @Test
    void setFirstName() {
        person.setFirstName("Ali");
        String firstName = person.getFirstName();
        Assertions.assertEquals(firstName , "Ali");
    }

    @Test
    void getLastName() {
        person.setLastName("Ali");
        String lastName =  person.getLastName();
        Assertions.assertEquals("Ali" , lastName);
    }

    @Test
    void setLastName() {
        person.setLastName("Ali");
        String lastName = person.getLastName();
        Assertions.assertEquals(lastName , "Ali");
    }
}