package section2.aop.aspect.book;

import org.springframework.stereotype.Component;


@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take the book from SchoolLibrary");
    }
}
