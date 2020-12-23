package ioc_di.classes;


public class Cat implements Pet {

    private String nickname;

    public Cat() {
        // default
        System.out.println("Default constructor Cat bean is created");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

}
