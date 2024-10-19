public class Person {

    /* Task 4.   Constructor.   Session.
       Cоздайте класс Person c полями(name, age, work, salary, phone). В main создайте 5 объектов класса, дайте
     значения через конструктор, положите эти объекты в массив, сначала выведите все эти объекты на консоль.
     Теперь выведите человека у которого самая высокая зарплата, выведите у кого самая низкая зарплата, выведите у
     кого самый дорогой телефон.
         */
    String name;
    int age;
    String work;
    double salary;
    int phone;

    public Person(){
    }

    public Person(String name, int age, String work, double salary, int phone){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Person:  " +
                "name:  " + name  +
                "   age:  " + age +
                "   work:  " + work  +
                "    salary:  " + salary +
                "    phone:  " + phone ;
    }









}