package competetive.dynamicProg;

import java.util.ArrayList;
import java.util.List;

public class ThreePalindromicString {
    public static void main(String[] args) {
        String s= "madamciviclevel";
        System.out.println(checkPalindromicStr(s));
    }

    private static List<String> checkPalindromicStr(String word) {
        List<String> res = new ArrayList<>();
        int[] dp = new int[word.length()];
        boolean[][] isPalindrome = new boolean[word.length()][word.length()];
        for(int i=0;i<word.length();i++) {
            int min = i;
            for(int j=0;j<=i;j++) {
                if(word.charAt(j) == word.charAt(i) && (i-j<2 || isPalindrome[j+1][i-1])){
                    isPalindrome[j][i] = true;
                    min = Math.min(min, j==0 ? 0 : dp[j-1] + 1);
                }
            }
            dp[i] = min;
        }
        if(dp[word.length()-1] > 2) {
            res.add("Impossible");
            return res;
        }
        List<Integer> last = new ArrayList<>();
        for(int i=0;i<word.length() - 1;i++) {
            if(isPalindrome[i][word.length()-1] == true)
                last.add(i);
        }
        for(int l : last) {
            for(int i=0;i<l;i++) {
                if(isPalindrome[0][i] && isPalindrome[i+1][l-1]) {
                    res.add(word.substring(0, i+1));
                    res.add(word.substring(i+1, l));
                    res.add(word.substring(l));
                    return res;
                }
            }
        }
        res.add("Impossible");
        return res;
    }
}
