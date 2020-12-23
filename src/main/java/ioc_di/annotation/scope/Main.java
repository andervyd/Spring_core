//: Bean scope: @Scope("singleton")
//              @Scope("prototype")

package ioc_di.annotation.scope;

import ioc_di.classes.Cow;
import ioc_di.classes.Mouse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "annotation" + File.separator + "applicationContext.xml");


        Cow firstCow = context.getBean("cowBean", Cow.class);
        Cow secondCow = context.getBean("cowBean", Cow.class);

        System.out.println("\nLinks to one object? '" + firstCow.equals(secondCow) + "'\n");

        Mouse firstMouse = context.getBean("mouseBean", Mouse.class);
        Mouse secondMouse = context.getBean("mouseBean", Mouse.class);

        System.out.println("\nLinks to one object? '" + firstMouse.equals(secondMouse) + "'\n");

        context.close();
    }
}/* Output: @Scope("singleton")
            Links to one object? 'true'

    Output: @Scope("prototype")
            Links to one object? 'false'
*///:~