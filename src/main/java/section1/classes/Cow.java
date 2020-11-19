//: // defaul bean: @Component - class Cow     => bean - cow
//                             - class MyCow   => bean - myCow
//                             - class SQLBase => bean - SQLBase

package section1.classes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("cowBean")
@Scope("singleton")
public class Cow implements Pet {

    public Cow() {
        // default
        System.out.println("Default constructor Cow bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cow say: Moo");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Cow: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cow: init method");
    }

}
