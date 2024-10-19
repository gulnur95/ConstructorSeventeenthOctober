import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       /* HOMEWORK   Constructor.   Session.


   Book деген класс тузунуз полялары(id,bookName,price,genre,create  Date) Library деген класс тузунуз
   полялары(id,name,address,Book[] books)  Main ден 3 library 5 book тузунуз 1 id деги library нин ичиндеги бардык
   китептерди алып чыккан метод тузунуз*/

        Book book1 = new Book(1, "Odyssey Homer", 500, "Poem", LocalDate.of(2008,4,30));
        Book book2 = new Book(2, "War and peace", 300, "Roman", LocalDate.of(2000,7,24));
        Book book3 = new Book(3, "Forest Gump", 450, "Roman", LocalDate.of(1948, 11, 17));
        Book book4 = new Book(4, "Harry Potter", 600, "Fantasy", LocalDate.of(1932, 10,12) );
        Book book5 = new Book(5, "Sherlock Holmes", 400, "Detective", LocalDate.of(1918,2, 25) );

        Book[] books1 = {book1, book2, book3};
        Book[] books2 = {book1, book2, book3, book4, book5};
        Book[] books3 = {book1, book2};


        Library library1 = new Library(1,"Central library", "Street Wellington 40", books1 );
        Library library2 = new Library(1,"Royal library", "Street 50", books2 );
        Library library3 = new Library(1,"British library", "Street 70", books3);

        library1.listBooks();





        // Task 4. HOMEWORK  Constructor.   Session.

        /*Cоздайте класс Person c полями(name, age, work, salary, phone). В main создайте 5 объектов класса, дайте
        значения через конструктор, положите эти объекты в массив, сначала выведите все эти объекты на консоль.
        Теперь выведите человека у которого самая высокая зарплата, выведите у кого самая низкая зарплата, выведите у
        кого самый дорогой телефон.*/


//        Person person1 = new Person("TOMMY", 32, "Businessman", 90000, 70000);
//        Person person2 = new Person("ARTHUR", 29, "Barman", 60000, 50000);
//        Person person3 = new Person("JOHN", 25, "Driver", 50000, 40000);
//        Person person4 = new Person("FINN", 20, "Waiter", 29000, 45000);
//        Person person5 = new Person("BILLY", 35, "Manager", 70000, 80000);
//
//        Person[] people = {person1, person2, person3, person4, person5};
//
//        System.out.println("Список людей:");
//        for (Person person : people) {
//            System.out.println(person.toString());
//        }
//
//        Person maxSalary = person1;
//        for (Person worker : people) {
//            if (worker.salary > maxSalary.salary) {
//                maxSalary = worker;
//            }
//        }
//        System.out.println("\nСамая высокая зарплата : " + maxSalary);
//
//        Person minSalary = person1;
//        for(Person worker : people){
//            if (worker.salary < minSalary.salary){
//                minSalary=worker;
//            }
//        }
//        System.out.println("Самая низкая зарплата: " + minSalary);
//
//        Person expensivePhone = person1;
//        for(Person worker : people){
//            if(worker.phone > expensivePhone.phone){
//                expensivePhone=worker;
//            }
//        }
//        System.out.println("Самый дорогой телефон: " + expensivePhone);





        /*
        TASK 3   Session  Constructor
 Company деген класс тузунуз, полелери (company name, country, year of foundation, founder, groups[]).
 Group деген класс тузунуз, полелери(group name, start date, mentor), ушул класс Company класска поле катары  массив
 болуп барат. Person деген класс тузунуз, полелери(first name, last name, date of birth) ушул класс Company жана Group
 класстарга поле катары барат. main ден класстардын объектин тузуп полелерине маани бериниз жана консольго чыгарыныз.
         */
//        Person person1 = new Person("Adilet","Egemberdiev",LocalDate.of(2008,4,30));
//        Person person2 = new Person("Fatima","Altynbek kyzy",LocalDate.of(2004,8,1));
//        Person person3 = new Person("Mirlan","Tashtanbekov",LocalDate.of(1992,2,14));
//        Person person4 = new Person("Gulnur","Asanalieva",LocalDate.of(1995,2,23));
//        Person person5 = new Person("Bektur","Akylbekov",LocalDate.of(2004,3,3));
//        Person person6 = new Person("Sanjar","Abdumalikov",LocalDate.of(2009,7,29));
//        Person person7 = new Person("Mamyrgul","Zhursunbekova",LocalDate.of(2006,2,7));
//        Person person8 = new Person("Said","Abdurashitov",LocalDate.of(2008,7,29));
//        Person person9 = new Person("Enes","Marat uulu",LocalDate.of(2004,8,24));
//        Person person10 = new Person("Nursultan","Alymbekov",LocalDate.of(2007,1,2));
//        Person person11 = new Person("Elaman","Abjalov",LocalDate.of(2008,3,27));
//        Person person12 = new Person("Rahmankul","Zhakaev",LocalDate.of(2003,4,14));
//        Person person13 = new Person("Azmar","Kurmanbekov",LocalDate.of(2009,2,21));
//        Person person14 = new Person("Jyrgalbek","Amangulov",LocalDate.of(2009,2,15));
//        Person [] peopleJava ={person1,person2,person3,person4,person5,person6};
//        Person [] peopleJs = {person7,person8,person9,person10,person11,person12,person13,person14};
//
//
//        Group group1 = new Group(1,"Java 16",LocalDate.of(2024,9,9),"Aizat",peopleJava);
//        Group group2 = new Group(2,"JS 16",LocalDate.of(2024,9,9),"Rabiya",peopleJs);
//        Group [] groups ={group1,group2};
//        for (Group group: groups) {
//            if (group.id == 1){
//                System.out.println(group.people.toString());
//            }
//        }
//
//        Company company = new Company("Peaksoft","KG",LocalDate.of(2020,11,16),"Esen Niazov",groups);
//        System.out.println(company);




         // Task 1  Task 2  Session
        /*
Создайте  класс  Student  с  полями (name,  date  of  birth(LocalDate), phone  number,  nationality)  создайте
конструктор  по  умолчанию  и  еще один  с  аргументами.  В  main создайте  5  объектов  Student  дайте
значение  полям  через  конструктор. Теперь  эти  объекты  положите  в массив и выведите на консоль.
Напишите логику которая посчитает сколько лет студенту сейчас (подсказка: используйте class Period и его методы)
 */
//
//        Student student1 = new Student("Joe", LocalDate.of(2004, 10, 17), "070245677", "Kyrgyz");
//        Student student2 = new Student("Mia", LocalDate.of(2002, 11, 23), "0705889799", "Japanese");
//        Student student3 = new Student("Bryan", LocalDate.of(2003, 9, 23), "0705349799", "German");
//        Student student4 = new Student("Jason", LocalDate.of(2002, 11, 23), "0705889799", "American");
//        Student student5 = new Student("Kate", LocalDate.of(1998, 9, 23), "0705349799", "Italian");
//
//        Student[] students = {student1, student2, student3, student4, student5};
//
//        for (Student student : students) {
//            System.out.print(student);
//            System.out.println("   Age: " + student.getAge());
//        }


     }
}