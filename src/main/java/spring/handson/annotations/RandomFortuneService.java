package spring.handson.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // Create an array of strings
    private String[] services = {
            "Work hard and you will be rewarded",
            "Be cautious with your words",
            "Good day to try something new"
    };

    // Random number generator
    private Random myRand = new Random();

    public String getFortune() {
        // Pick a random string from array
        return services[myRand.nextInt(services.length)];
    }
}
