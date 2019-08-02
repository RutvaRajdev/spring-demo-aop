package spring.handson.annotations;

import java.io.IOException;

public class BasketballCoach implements Coach {
    public FortuneService fortuneService;

    public BasketballCoach(FortuneService someFortuneService) {
        fortuneService = someFortuneService;
    }

    public String getDailyWorkout() {
        return "Practise bank hand volley for 15 minutes";
    }

    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
