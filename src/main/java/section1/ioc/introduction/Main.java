package section1.ioc.introduction;


import section1.classes.Cat;
import section1.classes.Dog;
import section1.classes.Pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();

    }
}
