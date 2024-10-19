import java.time.LocalDate;

public class Book {

    /* HOMEWORK     Constructor.   Session.
   Book деген класс тузунуз полялары(id,bookName,price,genre,create  Date) Library деген класс тузунуз
   полялары(id,name,address,Book[] books)  Main ден 3 library 5 book тузунуз 1 id деги library нин ичиндеги бардык
   китептерди алып чыккан метод тузунуз*/

    int id;
    String bookName;
    int price;
    String genre;
    LocalDate createDate;

    public Book(int id, String bookName, int price, String genre, LocalDate createDate){
        this.id =id;
        this.bookName =bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;

    }

    @Override
    public String toString() {
        return "\nBook: " +
                "id: " + id +
                "    bookName: " + bookName +
                "    price: " + price +
                "    genre: " + genre +
                "    createDate: " + createDate;
    }
}
