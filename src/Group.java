import java.time.LocalDate;
import java.util.Arrays;

public class Group {

    // Task 3
    long id;
    String groupName;
    LocalDate startDate;
    String mentor;
    Person1[] people;
    public Group(){
    }
    public Group(long id, String groupName, LocalDate startDate, String mentor, Person1[] people){
        this.id = id;
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.people = people;
    }
    @Override
    public String toString() {
        return "\n\nGroup class: " +
                "groupName: " + groupName +
                ",\nstartDate: " + startDate +
                ",\nmentor: " + mentor  +
                " \npeople: \n" + Arrays.toString(people) ;
    }
}
