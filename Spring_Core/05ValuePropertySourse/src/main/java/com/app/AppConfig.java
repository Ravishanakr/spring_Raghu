package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


//you can write in any order
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {

}
