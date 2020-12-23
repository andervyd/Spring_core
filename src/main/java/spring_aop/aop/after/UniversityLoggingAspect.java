package spring_aop.aop.after;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution( * getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Logging list of students before method");
    }

/*
    @AfterReturning("execution( * getStudents())")
    public void afterReturningGetStudentsLoggingAdvice() {
        System.out.println("Logging list of students after method");
    }
*/

    @AfterReturning(pointcut =  "execution( * getStudents())",
                    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        students.get(0).setName("Oleg");
/*
        Student firstStudent = students.get(0);
        firstStudent.setName("Oleg");
*/

        System.out.println("Logging list of students after method");
    }

    @AfterThrowing(pointcut = "execution( * getStudents())",
                   throwing = "exception")
    public  void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("Run catch exception: " + exception);
    }

    @After("execution( * getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("End method.");
    }
}
