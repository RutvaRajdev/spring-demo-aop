package spring.handson.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService myFortuneService){
        fortuneService = myFortuneService;
    }

    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
