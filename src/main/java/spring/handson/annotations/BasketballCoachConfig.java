package spring.handson.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class BasketballCoachConfig {

    // Define bean for sad fortune service
    @Bean
    public FortuneService someFortuneService() {
        return new SomeFortuneService();
    }

    // Define bean for swim coach and inject dependency
    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach(someFortuneService());
    }

}
