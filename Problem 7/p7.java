import java.math.*;
import java.lang.Long;

class P7 {

    public static void main(String[] args) {
        int numPrime = 10001, count = 0, prime = 0;
        for (int i = 2; count < numPrime; i++) {
            if (isPrime(i)) {
                prime = i;
                count++;
            }
        }
        System.out.println(prime);
    }

    static boolean isPrime(final int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}