package section2.aop.pointcut.check_main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section2.aop.pointcut.config_class.MyConfig;
import section2.aop.pointcut.library.CityLibrary;

public class MainForCombineAspect {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        CityLibrary cityLibrary = context.getBean("cityLibrary", CityLibrary.class);

        cityLibrary.getBooks();
        cityLibrary.getJournals();

        System.out.println("-------------------------------------");

        cityLibrary.returnBook();
        cityLibrary.returnJournal();

        System.out.println("-------------------------------------");

        cityLibrary.addBook();
        cityLibrary.addJournal();


        context.close();
    }
}
