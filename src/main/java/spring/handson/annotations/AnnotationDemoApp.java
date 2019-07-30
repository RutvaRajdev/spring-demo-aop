package spring.handson.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        // Read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from container
        Coach theCoach = context.getBean("cricketCoach", Coach.class);

        // Call a method on bean
        System.out.println(theCoach.getDailyWorkout());

        // Close context
        context.close();
    }
}
