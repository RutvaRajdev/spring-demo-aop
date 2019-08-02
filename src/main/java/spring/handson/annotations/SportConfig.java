package spring.handson.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.handson.annotations.Coach;
import spring.handson.annotations.FortuneService;
import spring.handson.annotations.SadFortuneService;
import spring.handson.annotations.SwimCoach;

@Configuration
//@ComponentScan("spring.handson.annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // Define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
