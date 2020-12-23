package spring_aop.aop.aspect.config_class;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring_aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
