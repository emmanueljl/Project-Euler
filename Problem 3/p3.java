import java.math.*;
import java.lang.Long;

class P3 {

    public static void main(String[] args) {
        long num = 600851475143L;
        for (long i = (long) Math.sqrt(num); i > 0; i--) {
            if (num % i == 0 && isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    static boolean isPrime(final long num) {
        for (long i = 2; i <= (long) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}