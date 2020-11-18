package annotation.autowired_di;


import animals.Person;
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
