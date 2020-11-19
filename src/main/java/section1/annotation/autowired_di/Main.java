package section1.annotation.autowired_di;


import section1.classes.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation/applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.calYouPet();

        context.close();

    }
}
