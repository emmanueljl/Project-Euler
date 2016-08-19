import java.io.File;
import java.util.Scanner;

class P13 {

    public static void main(String[] args) {
        final String[] nums = new String[100];
        try {
            Scanner scanner = new Scanner(new File("nums"));
            for (int i = 0; i < 100; i++) {
                nums[i] = scanner.next();
            }

            // for (int i = 0; i < 100; i++) {
            //     System.out.println(nums[i]);
            // }
        } catch (Exception e) {
            System.out.println("File 'nums' not found!");
        }

        // Add from least to most significant digit, keeping track of carry over. Once MSD is reached, digits' sum is simply prepended to the sum.
        String sum = "";
        long carry = 0;
        int currDigit = 50 - 1;
        for (;;) {
            long digitSum = carry;
            for (String num : nums) {
                digitSum += Character.getNumericValue(num.charAt(currDigit));
            }

            if (currDigit == 0) {
                sum = digitSum + sum;
                break;
            }

            carry = digitSum / 10;
            sum = (digitSum - (carry * 10)) + sum;

            currDigit--;
        }

        System.out.println(sum.substring(0, 10));
    }

}