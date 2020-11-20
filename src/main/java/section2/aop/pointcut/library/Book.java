package section2.aop.pointcut.library;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Book {

    @Value("2105:Vega")
    private String name;

    @Value("John Snow")
    private String author;

    @Value("1986")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
