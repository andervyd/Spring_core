package section2.aop.pointcut.library;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Book {

    @Value("2105:Vega")
    private String name;

    public String getName() {
        return name;
    }

}
