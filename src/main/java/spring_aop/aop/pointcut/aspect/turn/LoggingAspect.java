package spring_aop.aop.pointcut.aspect.turn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_aop.aop.pointcut.library.Book;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

/*
    @Before("section2.aop.pointcut.aspect.turn.Pointcuts.allGetMethods()")
    public void beforeGetLogging() {
        System.out.println("Trying to get a book or journal...");
    }
*/

    @Before("spring_aop.aop.pointcut.aspect.turn.Pointcuts.allAddMethods()")
    public void beforeAddLogging(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature => " + methodSignature);
        System.out.println("methodSignature.getMethod(); => " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(); => " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(); => " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();

            for(Object object : arguments) {
                if(object instanceof Book) {
                    Book book = (Book) object;
                    System.out.println("Info about book: name - " + book.getName() +
                            ", author - " + book.getAuthor() + ", year - " + book.getYearOfPublication());
                } else if(object instanceof String) {
                    System.out.println("Added book on library: name - " + object);
                }
            }
        }







        System.out.println("Trying to get a book or journal...");
    }

}
