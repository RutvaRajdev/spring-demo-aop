package spring.handson.annotations;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public String getDailyWorkout() {
        return "Practice batting to yorker balls for 15 minutes";
    }
}
