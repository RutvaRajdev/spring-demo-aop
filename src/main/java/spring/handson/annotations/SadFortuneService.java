package spring.handson.annotations;

import java.io.IOException;

public class SadFortuneService implements FortuneService {
    public String getFortune() throws IOException {
        return "It is going to be a difficult and sad day";
    }
}
