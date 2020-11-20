package section2.aop.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


//@Component
//@Aspect
public class LoggingAndSecurityAspectWithCombineNew {

    @Pointcut("execution( * section2.aop.pointcut.library.CityLibrary.*(..))")
    private void allMethodsFromCityLibrary() {}

    @Pointcut("execution( * section2.aop.pointcut.library.CityLibrary.returnJournal(..))")
    private void returnJournalMethodsFromCityLibrary() {}

    @Pointcut("allMethodsFromCityLibrary() && !returnJournalMethodsFromCityLibrary()")
    private void exceptReturnJournalMethodsFromCityLibrary() {}

    @Before("exceptReturnJournalMethodsFromCityLibrary()")
    public void beforeAllMethodsFromCityLibrary() {
        System.out.println("beforeAllMethodsFromCityLibrary(): writing log #5");
    }


}
