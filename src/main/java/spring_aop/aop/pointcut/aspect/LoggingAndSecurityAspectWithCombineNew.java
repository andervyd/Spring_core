package spring_aop.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//@Component
//@Aspect
public class LoggingAndSecurityAspectWithCombineNew {

    @Pointcut("execution( * spring_aop.aop.pointcut.library.CityLibrary.*(..))")
    private void allMethodsFromCityLibrary() {}

    @Pointcut("execution( * spring_aop.aop.pointcut.library.CityLibrary.returnJournal(..))")
    private void returnJournalMethodsFromCityLibrary() {}

    @Pointcut("allMethodsFromCityLibrary() && !returnJournalMethodsFromCityLibrary()")
    private void exceptReturnJournalMethodsFromCityLibrary() {}

    @Before("exceptReturnJournalMethodsFromCityLibrary()")
    public void beforeAllMethodsFromCityLibrary() {
        System.out.println("beforeAllMethodsFromCityLibrary(): writing log #5");
    }


}
