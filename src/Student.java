import java.time.LocalDate;
import java.time.Period;
/*
// Task 1  Task 2  Session
Создайте  класс  Student  с  полями (name,  date  of  birth(LocalDate), phone  number,  nationality)  создайте
конструктор  по  умолчанию  и  еще один  с  аргументами.  В  main создайте  5  объектов  Student  дайте
значение  полям  через  конструктор. Теперь  эти  объекты  положите  в массив и выведите на консоль.
Напишите логику которая посчитает сколько лет студенту сейчас (подсказка: используйте class Period и его методы)
 */

public class Student {
    // Task 1, Task 2
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Student(){}

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber= phoneNumber;
        this.nationality= nationality;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        return age.getYears();

    }


    @Override
    public String toString() {
        return "\nStudent " +
                "name: " + name  +
                "      dateOfBirth: " + dateOfBirth +
                "      phoneNumber: " + phoneNumber  +
                "      nationality: " + nationality ;
    }
}
