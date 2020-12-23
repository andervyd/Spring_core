package spring_aop.aop.pointcut.check_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_aop.aop.pointcut.config_class.MyConfig;
import spring_aop.aop.pointcut.library.PublicLibrary;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        PublicLibrary publicLibrary = context.getBean("publicLibrary", PublicLibrary.class);
//        Book book = context.getBean("book", Book.class);

//        publicLibrary.getBooks(book);
        publicLibrary.getBooks();

        System.out.println("-------------------------------");

        publicLibrary.getJournals();

        context.close();

    }
}
