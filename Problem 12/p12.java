import java.lang.Math;

class P12 {

    public static void main(String[] args) {
        long i = 1, triangularNum = 1;
        long factors = countFactors(triangularNum);
        while (factors <= 500) {
            i++;
            triangularNum += i;
            factors = countFactors(triangularNum);
            // System.out.println(triangularNum + " --- " + factors);
        }
        System.out.println(triangularNum);
    }

    static int countFactors(final long num) {
        int count = 2;
        int i;
        for (i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += 2;
            }
        }
        if (i * i == num) { // prevent double count of square root
            count++;
        }
        return count;
    }

}