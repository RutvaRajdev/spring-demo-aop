package spring.handson.annotations;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice batting to yorker balls for 15 minutes";
    }

    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
