package annotation.value;

import animals.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation" + File.separator + "applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        System.out.println("Name: " + person.getFirstName() +
                ", age: " + person.getAge());


        context.close();
    }
}
