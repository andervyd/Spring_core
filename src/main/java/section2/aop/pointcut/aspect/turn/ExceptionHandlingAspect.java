package section2.aop.pointcut.aspect.turn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

/*
    @Before("section2.aop.pointcut.aspect.turn.Pointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("Try / catch exception...");
    }
*/

    @Before("section2.aop.pointcut.aspect.turn.Pointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("Try / catch exception...");
    }

}
