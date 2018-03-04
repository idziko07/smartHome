package pl.springJava.springContext.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"pl.springJava.springContext.controller", "pl.springJava.springContext.smartHome","pl.springJava.springContext.weather"})
public class AppConfig {

}
