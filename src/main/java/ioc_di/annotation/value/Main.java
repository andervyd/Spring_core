package ioc_di.annotation.value;

import ioc_di.classes.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "section1" + File.separator + "annotation" + File.separator + "applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        System.out.println("Name: " + person.getFirstName() +
                ", age: " + person.getAge());

        context.close();
    }
}
