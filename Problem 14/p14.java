import java.lang.Math;
import java.util.HashMap;

class P14 {

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int longestLengthNum = 1;
        long longestLength = 0;
        for (int i = 1; i < 1000000; i++) {
            long length = collatz.collatzLength(i);
            if (length > longestLength) {
                longestLength = length;
                longestLengthNum = i;
            }

        }
        System.out.println(longestLengthNum);
    }

    static class Collatz {

        HashMap<Long, Long> lengths = new HashMap<Long, Long>();

        public long collatzLength(final long num) {
            if (lengths.containsKey(num)) {
                return lengths.get(num);
            }

            long n = num, length = 0;
            for (;;) {
                if (n == 1) {
                    length++;
                    break;
                }

                if (lengths.containsKey(n)) {
                    length += lengths.get(n);
                    break;
                }

                if (n % 2 == 0) { // even
                    n = n / 2;
                } else { // odd
                    n = (3 * n) + 1;
                }
                length++;
            }

            lengths.put(num, length);
            return length;
        }

    }

}