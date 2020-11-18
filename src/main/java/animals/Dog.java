package animals;


public class Dog implements Pet{

    public Dog() {
        // default
        System.out.println("Default constructor Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("Class Dog: method init();");
    }

    public void destroy() {
        System.out.println("Class Dog: method destroy();");
    }

}
