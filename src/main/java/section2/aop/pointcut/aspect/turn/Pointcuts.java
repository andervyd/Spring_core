package section2.aop.pointcut.aspect.turn;

import org.aspectj.lang.annotation.Pointcut;


public class Pointcuts {

/*
    @Pointcut("execution( * get*())")
    public void allGetMethods() {}
*/

    @Pointcut("execution( * add*(..))")
    public void allAddMethods() {}

}
