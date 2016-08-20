class P17 {

    public static void main(String[] args) {
        long totalLetters = 0;
        for (int i = 1; i <= 999; i++) {
            totalLetters += lettersInNum(i);
        }
        totalLetters += 11; // "one thousand"

        System.out.println(totalLetters);
        // System.out.println(lettersInNum(Integer.parseInt(args[0])));
    }

    static int lettersInNum(final int num) {
        switch (num) {
            case 1: return 3; // "one"
            case 2: return 3; // "two"
            case 3: return 5; // "three"
            case 4: return 4; // "four"
            case 5: return 4; // "five"
            case 6: return 3; // "six"
            case 7: return 5; // "seven"
            case 8: return 5; // "eight"
            case 9: return 4; // "nine"
            case 10: return 3; // "ten"
            case 11: return 6; // "eleven"
            case 12: return 6; // "twelve"
            case 13: return 8; // "thirteen"
            case 14: return 8; // "fourteen"
            case 15: return 7; // "fifteen"
            case 16: return 7; // "sixteen"
            case 17: return 9; // "seventeen"
            case 18: return 8; // "eighteen"
            case 19: return 8; // "nineteen"
        }

        // num > 19
        int letters = 0;

        int hundreds = num / 100;
        // System.out.println("Hundreds = " + hundreds);
        if (hundreds > 0) {
            letters += lettersInNum(hundreds);
            letters += 7; // "hundred"
        }

        int rem = num - (hundreds * 100);
        // System.out.println("Remainder = " + rem);
        if (rem > 0) {
            if (hundreds > 0) {
                letters += 3; // "and"
            }

            int tens = rem / 10;
            // System.out.println("Tens = " + tens);
            switch (tens) {
                case 0: case 1: return letters + lettersInNum(rem);
                case 2: letters += 6; break; // "twenty"
                case 3: letters += 6; break; // "thirty"
                case 4: letters += 5; break; // "forty"
                case 5: letters += 5; break; // "fifty"
                case 6: letters += 5; break; // "sixty"
                case 7: letters += 7; break; // "seventy"
                case 8: letters += 6; break; // "eighty"
                case 9: letters += 6; break; // "ninety"
            }

            int ones = rem - (tens * 10);
            // System.out.println("Ones = " + ones);
            if (ones > 0) {
                letters += lettersInNum(ones);
            }
        }

        return letters;
    }

}