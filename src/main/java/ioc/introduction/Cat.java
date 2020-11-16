package ioc.introduction;


public class Cat implements Pet {

    public Cat() {
        // default
        System.out.println("Default constructor Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

}
