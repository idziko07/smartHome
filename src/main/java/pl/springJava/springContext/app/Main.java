package pl.springJava.springContext.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.springJava.springContext.config.AppConfig;
import pl.springJava.springContext.smartHome.SmartHome;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SmartHome smartHome = context.getBean(SmartHome.class);
       // smartHome.runController();
    }
}
