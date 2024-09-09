public class Multiples {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int count = 0;

        while (start <= end) {

            boolean by3 = start % 3 == 0;
            boolean by5 = start % 5 == 0;

            if (by3){
                count++;
            }
            else if (by5){
                count++;
            }
            start++;

        }
        System.out.println(count);
    }
}
