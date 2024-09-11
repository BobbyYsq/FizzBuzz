import java.util.Random;

public class Reduce {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        int n = randomInt;
        int count = 0;
        while (n > 0) {

            boolean iseven = n % 2 == 0;
            boolean isodd = n % 2 == 1;

            if (iseven) {
                n = n / 2;
            }
            else if (isodd) {
                n = n - 1;

            }
            count++;
        }
        System.out.println(count);
    }
}
