class P9 {

    public static void main(String[] args) {
        int a, b, c;
        for (a = 1; a < 1000 - 1; a++) {
            for (b = a + 1; b < 1000; b++) {
                int cSquared = a*a + b*b;
                if (isPerfectSquare(cSquared)) {
                    c = (int) Math.sqrt(cSquared);
                    if (a + b + c == 1000) {
                        System.out.println(a * b * c);
                        return;
                    }
                }
            }
        }
    }

    static boolean isPerfectSquare(final int num) {
        final int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num;
    }

}