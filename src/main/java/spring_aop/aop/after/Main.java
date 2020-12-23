package spring_aop.aop.after;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        University university = context.getBean("university", University.class);

        university.addStudents();

/*
        try {
            List<Student> studentList = university.getStudents();
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
*/

        List<Student> studentList = university.getStudents();
        for (Student student : studentList) {
            System.out.println(student);
        }



        context.close();
    }
}
