package com.example.study_spring_boot;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.tomcat.TomcatWebServer;

@SpringBootApplication
public class StudySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringBootApplication.class, args);
    }
//    Example Tomcat Config
//    @ConditionalOnClass(Tomcat.class)
//    public TomcatWebServer createServer(){
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(9000);
//        return new TomcatWebServer(tomcat);
//    }
}
