package competetive.ArrayProg;

import java.text.NumberFormat;

class zalandoQ2AllPossibleDivisibleBy3 {
    public static void main(String[] args) {
        String s = "0081";
        System.out.println(divisibleByK(s));
    }

    private static int divisibleByK(String S) {
        int countRes= 0;
        int multipliers = Integer.parseInt("3".repeat(S.length()));
        for (int i = 1; i < multipliers; i++) {
            int operation= i * 3;
            boolean isValid= differ(S, formatNumber(operation, S.length()));
            if(isValid) countRes++;
        }
        return countRes;
    }
    private static String formatNumber(int num, int length) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(length);
        nf.setGroupingUsed(false);
        return nf.format(num);
    }

    public static boolean differ(String s1,String s2 ) {
        int dif = 0;
        char[] c1= s1.toCharArray();
        char[] c2= s2.toCharArray();
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != (c2[i])) {
                dif++;
            }
            if(dif > 1)
                return false;
        }
        return true;
    }
}
