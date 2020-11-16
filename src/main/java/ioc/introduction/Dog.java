package ioc.introduction;


public class Dog implements Pet{

    public Dog() {
        // default
        System.out.println("Default constructor Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

}
