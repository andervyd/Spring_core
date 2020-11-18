package ioc.introduction;


import animals.Cat;
import animals.Dog;
import animals.Pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();

    }
}
