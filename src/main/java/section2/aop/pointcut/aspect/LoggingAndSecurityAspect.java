package section2.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


//@Component
//@Aspect
public class LoggingAndSecurityAspect {

/*    @Before("execution(public void getBooks(String))")
    public void beforeGetTryBook() {
        System.out.println("Trying to get a book...");
    }
*/

/*
    @Before("execution(public void get*(*))")
    public void beforeGetTryBook() {
        System.out.println("Trying to get a book...");
    }
*/

/*
    @Before("execution(public void *(..))")
    public void beforeGetTryBook() {
        System.out.println("Trying to get a book...");
    }
*/

/*
    // with Book.class
    @Before("execution(public void *(section2.aop.pointcut.library.Book))")
    public void beforeGetTryBook() {
        System.out.println("Trying to get a book...");
    }
*/

    @Pointcut("execution( * get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLogging() {
        System.out.println("Trying to get a book or journal...");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurity() {
        System.out.println("Checking to access on book or journal...");
    }

}
