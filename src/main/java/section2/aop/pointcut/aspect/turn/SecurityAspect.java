package section2.aop.pointcut.aspect.turn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("section2.aop.pointcut.aspect.turn.Pointcuts.allGetMethods()")
    public void beforeGetSecurity() {
        System.out.println("Checking to access on book or journal...");
    }

}
