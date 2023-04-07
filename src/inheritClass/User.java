package inheritClass;

import mainClass.Person;

/**
 * Author: Ali Khosravani
 * Date: 29-04-2023
 * Desc: User inheritance from Person.
 */
public class User extends Person {

    public static String fullName() {
        User user = new User();
        user.setFirstName("Ali");
        user.setLastName("Khosravani");
        return user.getFirstName() + " " + user.getLastName();


    }
}
