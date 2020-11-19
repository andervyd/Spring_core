package section2.aop.aspect.book;

import org.springframework.stereotype.Component;


@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take the book from PublicLibrary");
    }

/*
    public void returnBook() {
        System.out.println("We return the book from PublicLibrary");
    }
*/

    public String returnBook() {
        System.out.println("We return the book from PublicLibrary");
        return "Done";
    }

    public void getJournal() {
        System.out.println("We take the journal from PublicLibrary");
    }

}
