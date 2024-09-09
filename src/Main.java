import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FizzBuzz.main(args);
        Multiples.main(args);
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Reduce.main(randomInt);
    }
}
