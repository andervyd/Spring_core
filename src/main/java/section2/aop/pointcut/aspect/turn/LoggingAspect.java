package section2.aop.pointcut.aspect.turn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("section2.aop.pointcut.aspect.turn.Pointcuts.allGetMethods()")
    public void beforeGetLogging() {
        System.out.println("Trying to get a book or journal...");
    }

}
