package spring.handson.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("In Tennis coach default constructor");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("inside init method tenniscoach");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("inside destroy method tenniscoach");
    }

//    @Autowired
//    public void doSomething(FortuneService myFortuneService) {
//        System.out.println("Inside doSomething method tennis coach");
//        fortuneService = myFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService myFortuneService){
//        fortuneService = myFortuneService;
//    }

    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
