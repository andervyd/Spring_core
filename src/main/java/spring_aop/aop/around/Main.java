package spring_aop.aop.around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Run main method ...\n");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        System.out.println(schoolLibrary.returnBook());

        context.close();
        System.out.println("\n... end main method.");
    }
}
