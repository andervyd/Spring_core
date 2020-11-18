package animals;

import animals.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Value("Ivan")
    @Value("${person.firstName}")
    private String firstName;
//    @Value("34")
    @Value("${person.age}")
    private int age;

//    @Autowired
//    @Qualifier("mouseBean")
    private Pet pet;


    public Person() {
        // default
        System.out.println("Default constructor Person bean is created");
    }

    @Autowired
    public Person(@Qualifier("mouseBean") Pet pet) {
        System.out.println("Constructor Person bean is created");
        this.pet = pet;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Class Person: setFirstName();");
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge();");
        this.age = age;
    }

//    @Autowired
//    @Qualifier("mouseBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet();");
        this.pet = pet;
    }

    public void calYouPet() {
        System.out.println("Come to me");
        pet.say();
    }
}
