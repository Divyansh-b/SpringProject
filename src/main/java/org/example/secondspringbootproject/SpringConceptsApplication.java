package org.example.secondspringbootproject;

import org.example.secondspringbootproject.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
    public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
    public static void main(String[] args) {
        logger.debug ("Welcome to Spring Concept Demo");
        logger.info("Starting Spring Boot Application...");
        ApplicationContext context = SpringApplication. run (SpringConceptsApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        demoBean.sayHello();
        logger.info("Application Started Successfully!");
        logger.debug ("Checking Context: {}", context.getBean (DemoBean.class) );
        logger.debug("\n*** Example Using @Autowire annotation on property ***");
    }
}