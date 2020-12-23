package ioc_di.ioc.introduction;


import ioc_di.classes.Cat;
import ioc_di.classes.Dog;
import ioc_di.classes.Pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();

    }
}
