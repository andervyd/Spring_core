package di.main;

import di.Person;
import ioc.introduction.Dog;
import ioc.introduction.Pet;

public class MainStandart {
    public static void main(String[] args) {

        Pet pet = new Dog();
        Person person = new Person(pet);
        person.calYouPet();

    }
}
