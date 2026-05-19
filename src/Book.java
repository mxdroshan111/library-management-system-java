public class Book {

    private final int bookId;
    private final String bookName;
    private final String bookAuthor;
    private boolean isAvailable;

    public Book(int Id,String name,String author){
        this.bookId = Id;
        this.bookName = name;
        this.bookAuthor = author;
    }
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayBookDetails() {
        System.out.println(bookId);
        System.out.println(bookName);
        System.out.println(bookAuthor);

        if(isAvailable) {
            System.out.println("This book is available");
        }

        else System.out.println("This book is cuurently unavailable");
    }

    public void borrowBook(){

        if(this.isAvailable) {
            System.out.println("You have borrowed the book "+bookName );
            this.isAvailable = false;
        }else{
            System.out.println("This book is unavailable !!");
        }
    }



}
