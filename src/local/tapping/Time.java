package local.tapping;
import java.util.Random;

/**
 * Created by Sam on 10/04/2017.
 */
public class Time {
    String timeNum;
    int toBeConverted;
    Random rand;
    public Time(){
        timeNum = "";
        toBeConverted = 0;
        rand = new Random();
    }

    public String RandomNumber(){
        toBeConverted = rand.nextInt(30) + 1;
        timeNum = Integer.toString(toBeConverted);
        return timeNum;
    }
}
