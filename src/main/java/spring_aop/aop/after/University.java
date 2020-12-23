package spring_aop.aop.after;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Ivan", 3, 4.7);
        Student student2 = new Student("Mary", 1, 4.5);
        Student student3 = new Student("John", 5, 3.8);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {

        System.out.println("Run work method: getStudents();");

        System.out.println(students.get(10)); // exception

        System.out.println("Info of students:");

        for(Student student : students) {
            System.out.println(student);
        }

        return students;
    }
}
