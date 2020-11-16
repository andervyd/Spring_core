package di;

import ioc.introduction.Pet;

public class Person {

    private String firstName;
    private int age;
    private Pet pet;

    public Person() {
        // default
        System.out.println("Default constructor Person bean is created");
    }

    public Person(Pet pet) {
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

    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet();");
        this.pet = pet;
    }

    public void calYouPet() {
        System.out.println("Come to me");
        pet.say();
    }
}
