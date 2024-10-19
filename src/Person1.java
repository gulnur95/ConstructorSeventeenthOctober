import java.time.LocalDate;

public class Person1 {

    // Task 3
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    public Person1(){
    }
    public Person1(String firstName, String lastName, LocalDate dateOfBirth ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "\nStudent:" +
                "    firstName: " + firstName  +
                ",     lastName: " + lastName  +
                "      dateOfBirth: " + dateOfBirth ;
    }
}
