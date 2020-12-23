package spring_aop.aop.around;

import org.springframework.stereotype.Component;
import spring_aop.aop.pointcut.library.Book;

@Component
public class SchoolLibrary {

    public void getBooks() {
        System.out.println("We take the book from SchoolLibrary");
        System.out.println("----------------------------------");
    }

/*
    public void returnBook() {
        System.out.println("We return the book on SchoolLibrary");
        System.out.println("----------------------------------");
    }
*/

    public String  returnBook() {

        System.out.println(10 / 0); // exception

        System.out.println("We return the book on SchoolLibrary");
        return "2105:Vega";
    }

    public void addBook(String personName, Book bookName) {
        System.out.println("We added the book from SchoolLibrary");
        System.out.println("----------------------------------");
    }

    public void getJournals() {
        System.out.println("We take the journal from SchoolLibrary");
        System.out.println("----------------------------------");
    }

    public void returnJournal() {
        System.out.println("We return the journal on SchoolLibrary");
        System.out.println("----------------------------------");
    }

    public void addJournal() {
        System.out.println("We added the journal from SchoolLibrary");
        System.out.println("----------------------------------");
    }

}
