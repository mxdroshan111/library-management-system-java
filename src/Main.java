import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        Book b1 = new Book(0001,"Half Girlfriend","Chetan Baghath");
        LibraryOperation LO = new LibraryOperation();
        LO.addBook(b1);
        System.out.println(LO.searchBookById(0001));
        LO.borrowBookOp(0001);
        System.out.println(b1.getBookAuthor());


    }
}

