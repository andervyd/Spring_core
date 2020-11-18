package ioc.spring_container.xml;

import animals.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


public class MainWithXMLApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ioc" + File.separator + "applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();

    }
}
