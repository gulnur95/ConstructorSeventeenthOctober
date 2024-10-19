import java.time.LocalDate;
import java.util.Arrays;

public class Company {

    // Task 3
    String companyName;
    String country;
    LocalDate foundationDate;
    String founder;
    Group[] groups;
    public Company(){
    }
    public Company(String companyName,String country,LocalDate foundationDate,String founder,Group[] groups){
        this.companyName = companyName;
        this.country = country;
        this.foundationDate = foundationDate;
        this.founder = founder;
        this.groups = groups;
    }
    @Override
    public String toString() {
        return "Company class: " +
                "companyName: " + companyName  +
                ", \ncountry: " + country  +
                ", \nfoundationDate: " + foundationDate +
                ", \nfounder: " + founder +
                " \ngroups: \n" + Arrays.toString(groups) ;
    }





}
