package spring.handson.annotations;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] services = new String[3];

    public void readFortunesFromFile() throws IOException {
        //File file = new File("fortunes.txt");

        BufferedReader br = new BufferedReader(new FileReader("C:\\Rutva\\SpringCourse_Udemy\\HandsOn\\springdemoannotations\\src\\main\\java\\spring\\handson\\annotations\\fortunes.txt"));
        String line;
        int i=0;

        while((line = br.readLine()) != null) {
            //System.out.println("line:"+line);
            services[i++]=line;
           // System.out.println("sout:"+services[0]);
        }

    }


    // Create an array of strings
//    private String[] services = {
//            "Work hard and you will be rewarded",
//            "Be cautious with your words",
//            "Good day to try something new"
//    };

    // Random number generator
    private Random myRand = new Random();

    public String getFortune() throws IOException {
        // Pick a random string from array
        readFortunesFromFile();
//        System.out.println(services[0]);
//        System.out.println(services[2]);
        return services[myRand.nextInt(services.length)];
        //return null;
    }
}
