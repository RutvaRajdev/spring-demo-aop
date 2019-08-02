package spring.handson.annotations;

import java.io.IOException;

public class SomeFortuneService implements FortuneService {
    public String getFortune() throws IOException {
        return "Be careful with your actions!";
    }
}
