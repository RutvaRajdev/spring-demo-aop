package spring.handson.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class JavaConfigDemoApp {

    public static void main(String[] args) throws IOException {
        // Read spring config file
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close context
        context.close();
    }
}
