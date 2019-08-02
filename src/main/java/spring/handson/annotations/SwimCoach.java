package spring.handson.annotations;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

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
