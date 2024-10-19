import java.util.Arrays;

public class Library {

     /* HOMEWORK     Constructor.   Session.
   Book деген класс тузунуз полялары(id,bookName,price,genre,create  Date) Library деген класс тузунуз
   полялары(id,name,address,Book[] books)  Main ден 3 library 5 book тузунуз 1 id деги library нин ичиндеги бардык
   китептерди алып чыккан метод тузунуз*/

    int id;
    String name;
    String address;
    Book[] books;


    public Library(int id, String name, String address, Book[] books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void listBooks(){
        System.out.println("Китепкана: " + name + "  id: " + id + "   Address: " + address + " - китептердин тизмеси:");
        for(Book book: books){
            System.out.println( book);
        }
    }


}






