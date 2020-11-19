package section2.aop.pointcut.check_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section2.aop.pointcut.config_class.MyConfig;
import section2.aop.pointcut.library.PublicLibrary;

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
