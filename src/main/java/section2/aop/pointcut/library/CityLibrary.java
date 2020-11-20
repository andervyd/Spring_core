package section2.aop.pointcut.library;

import org.springframework.stereotype.Component;


@Component
public class CityLibrary {

    public void getBooks() {
        System.out.println("We take the book from CityLibrary");
        System.out.println("----------------------------------");
    }

    public void returnBook() {
        System.out.println("We return the book on CityLibrary");
        System.out.println("----------------------------------");
    }

    public void getJournals() {
        System.out.println("We take the journal from CityLibrary");
        System.out.println("----------------------------------");
    }

    public void returnJournal() {
        System.out.println("We return the journal on CityLibrary");
        System.out.println("----------------------------------");
    }

    public void addBook(String personName, Book bookName) {
        System.out.println("We added the book from CityLibrary");
        System.out.println("----------------------------------");
    }

    public void addJournal() {
        System.out.println("We added the journal from CityLibrary");
        System.out.println("----------------------------------");
    }

}
