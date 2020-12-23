package ioc_di.main;

import ioc_di.classes.Person;
import ioc_di.classes.Dog;
import ioc_di.classes.Pet;

public class MainStandart {
    public static void main(String[] args) {

        Pet pet = new Dog();
        Person person = new Person(pet);
        person.calYouPet();

    }
}
