package ioc.spring_container.xml;

import ioc.introdaction.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ioc/applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();

    }
}
