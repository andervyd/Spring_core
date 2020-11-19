package section1.annotation.introduction;

import section1.classes.Cow;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation/applicationContext.xml");

        Cow myCow = context.getBean("cowBean", Cow.class);
        myCow.say();

        context.close();

    }
}
