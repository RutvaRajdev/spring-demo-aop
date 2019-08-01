package spring.handson.annotations;

import java.io.IOException;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService myFortuneService) {
        fortuneService = myFortuneService;
    }

    public String getDailyWorkout() {
        return "Swim for 1 hr today!";
    }

    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
