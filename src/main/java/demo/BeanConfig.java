package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // Configuration for bean file
@ComponentScan(basePackages = "demo") //Configuration for Beans of this package
@EnableAspectJAutoProxy
public class BeanConfig {
}
