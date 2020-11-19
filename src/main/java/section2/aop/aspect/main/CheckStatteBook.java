package section2.aop.aspect.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import section2.aop.aspect.book.SchoolLibrary;
import section2.aop.aspect.config_class.MyConfig;
import section2.aop.aspect.book.UniLibrary;


public class CheckStatteBook {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.getBook();
//        uniLibrary.returnBook();
        System.out.println(uniLibrary.returnBook());
//        uniLibrary.getJournal();

        System.out.println("---------------------------------");

/*
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
*/

        context.close();
    }
}
