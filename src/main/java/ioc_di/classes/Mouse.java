package ioc_di.classes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mouseBean")
@Scope("prototype")
public class Mouse implements Pet {

    public Mouse() {
        // default
        System.out.println("Default constructor Mouse bean is created");
    }

    @Override
    public void say() {
        System.out.println("Mouse say: Pie-pie");
    }

}
