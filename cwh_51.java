import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Library{
    String[] books;

    Library(String ...names){
        books = new String[names.length];

        for(int i=0; i<names.length; i++) {
            books[i] = names[i];
        }
    }

    void addBook(String name){
        int length = books.length;
        String[] newBooks = new String[length+1];
        for(int i=0; i<length; i++){
            newBooks[i] = books[i];
        }

        newBooks[length] = name;
        books = newBooks;
    }

    void showAvailableBooks(){
        for(String book: books){
            System.out.println(book);
        }
    }

    void issueBook(String name){
        List<String> list = new ArrayList<String>(Arrays.asList(books));
        list.remove(name);
        books = list.toArray(new String[0]);
    }

    void returnBook(String name){
        int length = books.length;
        String[] newBooks = new String[length+1];
        for(int i=0; i<length; i++){
            newBooks[i] = books[i];
        }

        newBooks[length] = name;
        books = newBooks;
    }
}

public class cwh_51 {
    public static void main(String[] args) {
        Library l = new Library("Harry Potter", "Five point someone");

        l.showAvailableBooks();

        l.issueBook("Harry Potter");
        l.returnBook("Harry Potter");

        l.addBook("NCERT Maths");

        l.showAvailableBooks();
    }
}


        // you have to implement a librabry using java class librabry
        // methods :add book,issue book , return book,show availablebooks
        //properties: array to store the available books
        // array to store the issued books



