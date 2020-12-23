package spring_aop.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

/*
    @Around("execution(public String returnBook())")
    public void aroundReturnBookAdvice() {
        System.out.println("Return book on library");
    }
*/

    @Around("execution(public String returnBook())")
    public String  aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        Object targetMethodResult = null;

        System.out.println("They try to return the book to the library");

        try {
//        long beginTime = System.currentTimeMillis();
            targetMethodResult = proceedingJoinPoint.proceed();
//        long endTime = System.currentTimeMillis();
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());

            throw e;

//            targetMethodResult = "unknown name";
        }
        System.out.println("The book was returned to the library");

//        System.out.println("Time for work method: " + (double)(endTime - beginTime)/1000 + " sec");
        return targetMethodResult.toString();
    }

}
