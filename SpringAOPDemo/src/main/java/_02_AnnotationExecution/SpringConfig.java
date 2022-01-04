package _02_AnnotationExecution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 16:46
 */
@Configuration
@ComponentScan(basePackages = "_02_AnnotationExecution")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
