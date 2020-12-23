package spring_aop.aop.around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring_aop.aop.around")
@EnableAspectJAutoProxy
public class Config {
}

