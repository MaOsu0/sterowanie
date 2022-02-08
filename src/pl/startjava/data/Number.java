package pl.startjava.data;
import java.util.Random;
public class Number {

    Random rand = new Random();
    final int bound = 10000;
    final int origin = 0;
    private int intRandom = rand.nextInt(origin,bound);

    public Number() {
        this.intRandom = intRandom;
    }

    public int getA() {
        return intRandom;
    }

    public boolean moreThan5000 = getA() > 5000;
    public boolean lessThan5000 = getA() < 5000;
    public boolean equal5000 = getA() == 5000;
    public boolean isEven = getA() % 2 == 0;
    public boolean is4Numbered = getA() < 1000 && getA() > 0;
    public boolean is3Numbered = getA() < 100 && getA() > 0;
    public boolean is2Numbered = getA() < 10 && getA() > 0;
    public boolean is0Number = getA() == 0;



}
