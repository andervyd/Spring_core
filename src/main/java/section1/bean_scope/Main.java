package section1.bean_scope;

import section1.classes.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean_scope" + File.separator + "applicationContext.xml");

        // Create: Default constructor Dog bean is created

        Cat whiteCat = context.getBean("myPet", Cat.class);
        whiteCat.setNickname("Cherry");

        Cat blackCat = context.getBean("myPet", Cat.class);
        blackCat.setNickname("Chap");

        System.out.println("\nLinks to one object? '" + whiteCat.equals(blackCat) + "'\n");

        System.out.println("Nickname white cat: " + whiteCat.getNickname() +
                "\nNickname black cat: " + blackCat.getNickname());

    }
}/* Output: scope "singleton"

            Default constructor Cat bean is created

            Links to one object? 'true'

            Nickname white cat: Chap
            Nickname black cat: Chap

    Output: scope "prototype"

            Default constructor Cat bean is created
            Default constructor Cat bean is created

            Links to one object? 'false'

            Nickname white cat: Cherry
            Nickname black cat: Chap
*///:~