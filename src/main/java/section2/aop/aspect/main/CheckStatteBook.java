package section2.aop.aspect.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section2.aop.aspect.config_class.MyConfig;
import section2.aop.aspect.book.Library;

public class CheckStatteBook {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library checkBook = context.getBean("libraryBean", Library.class);
        checkBook.getBook();


        context.close();
    }
}
