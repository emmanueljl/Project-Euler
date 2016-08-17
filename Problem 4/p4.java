class P4 {

    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    static boolean isPalindrome(final int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length() / 2; i++) {
            char leftDigit = s.charAt(i);
            char rightDigit = s.charAt(s.length() - 1 - i);
            if (leftDigit != rightDigit) return false;
        }
        return true;
    }

}