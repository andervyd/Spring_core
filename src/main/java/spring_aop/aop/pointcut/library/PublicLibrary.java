package spring_aop.aop.pointcut.library;

import org.springframework.stereotype.Component;


@Component
public class PublicLibrary {

/*
    public void getBooks(Book bookName) {
        System.out.println("We take the book from PublicLibrary: " + bookName.getName());
    }
*/

    public void getBooks() {
        System.out.println("We take the book from PublicLibrary");
    }

/*
    public void getJournal(int countJournal) {
        System.out.println("We take the journal from PublicLibrary: " + countJournal);
    }
*/

    public void getJournals() {
        System.out.println("We take the journal from PublicLibrary");
    }

}
