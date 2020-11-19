package section2.aop.pointcut.library;

import org.springframework.stereotype.Component;


@Component
public class CityLibrary {

    public void getBooks() {
        System.out.println("We take the book from CityLibrary");
    }

    public void returnBook() {
        System.out.println("We return the book on CityLibrary");
    }

    public void getJournals() {
        System.out.println("We take the journal from CityLibrary");
    }

    public void returnJournal() {
        System.out.println("We return the journal on CityLibrary");
    }

    public void addBook() {
        System.out.println("We added the book from CityLibrary");
    }

    public void addJournal() {
        System.out.println("We added the journal from CityLibrary");
    }

}
