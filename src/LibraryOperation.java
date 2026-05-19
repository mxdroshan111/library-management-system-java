import java.util.ArrayList;

public class LibraryOperation {

    private final ArrayList<Book> books;

    public LibraryOperation() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        book.setAvailable(true);
    }

    public Book searchBookById(int bookID) {

        for(Book book : books) {

            if(book.getBookId() == bookID) {

                return book;
            }
        }

        return null;
    }

    public Book searchBookByName(String bookName) {

        for(Book book : books) {

            if(book.getBookName().equalsIgnoreCase(bookName)) {

                return book;

            }
        }

        return null;
    }

    public void borrowBookOp(int bookID) {

        Book book = searchBookById(bookID);

        if(book == null) {
            System.out.println("Book not found");
            return;
        }

        if(book.isAvailable()) book.borrowBook();

        else System.out.println("Book is already borrowed . Try again later");
    }
}