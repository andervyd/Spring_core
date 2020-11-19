package section1.main;

import section1.classes.Person;
import section1.classes.Dog;
import section1.classes.Pet;

public class MainStandart {
    public static void main(String[] args) {

        Pet pet = new Dog();
        Person person = new Person(pet);
        person.calYouPet();

    }
}
