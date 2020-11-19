package section2.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


//@Component
//@Aspect
public class LoggingAndSecurityAspectWithCombine {

    @Pointcut("execution(public void get*())")
    private void allGetMethodsFromCityLibrary() {}

    @Pointcut("execution(public void return*())")
    private void allReturnMethodsFromCityLibrary() {}

    @Pointcut("allGetMethodsFromCityLibrary() || allReturnMethodsFromCityLibrary()")
    private void allGetAndReturnMethodsFromCityLibrary() {}

    @Before("allGetMethodsFromCityLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice(): writing log #1");
    }

    @Before("allReturnMethodsFromCityLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice(): writing log #2");
    }

    @Before("allGetAndReturnMethodsFromCityLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice(): writing log #3");
    }

}
