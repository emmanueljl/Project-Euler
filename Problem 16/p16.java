class P16 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java P16 [exponent]");
            return;
        }

        int exp = Integer.parseInt(args[0]);
        if (exp < 1) {
            System.err.println("Exponent must be >= 1");
            return;
        }

        String val = "2";
        for (int i = 1; i < exp; i++) {
            String dbl = "";
            int carry = 0;
            for (int c = val.length() - 1; c > 0; c--) {
                int digit = Character.getNumericValue(val.charAt(c));
                int doubleOfDigit = (digit * 2) + carry;
                carry = doubleOfDigit / 10;
                dbl = (doubleOfDigit % 10) + dbl;
            }
            val = ((Character.getNumericValue(val.charAt(0)) * 2) + carry) + dbl;
        }

        System.out.println(sumOfDigits(val));
    }

    static long sumOfDigits(final String num) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        return sum;
    }

}