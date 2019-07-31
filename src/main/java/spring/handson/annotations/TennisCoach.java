package spring.handson.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("In Tennis coach default constructor");
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
