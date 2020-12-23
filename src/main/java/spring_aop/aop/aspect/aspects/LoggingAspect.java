package spring_aop.aop.aspect.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


/*
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("Trying to get a book...");
    }
*/

/*
    @Before("execution(public void section2.aop.aspect.book.PublicLibrary.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("Trying to get a book...");
    }
*/

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Trying to get a book...");
    }

/*
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Trying to return a book...");
    }
*/

/*
    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Trying to return a book...");
    }
*/

    @Before("execution( * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Trying to return a book...");
    }

/*
    @Before("execution( * *())")
    public void beforeReturnBookAdvice() {
        System.out.println("Trying to return a book...");
    }
*/

}
