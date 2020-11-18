package di.main;

import animals.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MainWithDependencyInjection {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("di" + File.separator + "applicationContext.xml");

/*// Long variant:
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.calYouPet();
*/

/*// Short variant:
        Person person = new Person(context.getBean("myPet", Pet.class));
        person.calYouPet();
*/

// Variant with DI:
        Person person = context.getBean("myPerson", Person.class);
        person.calYouPet();

        System.out.println("Name: " + person.getFirstName() +
                ", age person: " + person.getAge());

        context.close();

    }
}
