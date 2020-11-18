//: javax.annotation-api 1.3.2 => for maven
//          @PostConstruct [init]
//          @PreDestroy    [destroy]

package annotation.init_destroy;

import animals.Cow;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "annotation" + File.separator + "applicationContext.xml");

        Cow cow = context.getBean("cowBean", Cow.class);
        cow.say();

        context.close();
    }
}
