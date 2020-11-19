package section2.aop.pointcut.config_class;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("section2.aop.pointcut")
@EnableAspectJAutoProxy
public class MyConfig {
}
