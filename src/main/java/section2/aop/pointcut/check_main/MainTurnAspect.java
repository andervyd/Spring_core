package section2.aop.pointcut.check_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section2.aop.pointcut.config_class.MyConfig;
import section2.aop.pointcut.library.Book;
import section2.aop.pointcut.library.CityLibrary;

public class MainTurnAspect {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        CityLibrary cityLibrary = context.getBean("cityLibrary", CityLibrary.class);
        Book book = context.getBean("book", Book.class);

        cityLibrary.addBook("Ivan", book);
        cityLibrary.addJournal();


/*
        cityLibrary.getBooks();

        System.out.println("-----------------------------");

        cityLibrary.getJournals();
*/





        context.close();
    }
}
