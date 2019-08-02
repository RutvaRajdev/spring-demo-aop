package spring.handson.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class BasketballJavaConfigApp {
    public static void main(String[] args) throws IOException {
        // Read spring config file
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(BasketballCoachConfig.class);

        // Get the bean from container
        BasketballCoach theCoach =  context.getBean("basketballCoach", BasketballCoach.class);

        // Call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Calling new swim coach methods
//        System.out.println("email: "+theCoach.getEmail());
//        System.out.println("Team: "+theCoach.getTeam());

        // Close context
        context.close();
    }
}
