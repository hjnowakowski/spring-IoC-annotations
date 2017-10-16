package info.henryk.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



public class AnnotationsDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = (Coach) context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
