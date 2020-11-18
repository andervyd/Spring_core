package di.main;

import animals.Person;
import animals.Dog;
import animals.Pet;

public class MainStandart {
    public static void main(String[] args) {

        Pet pet = new Dog();
        Person person = new Person(pet);
        person.calYouPet();

    }
}
