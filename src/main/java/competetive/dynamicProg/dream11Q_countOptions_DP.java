package competetive.dynamicProg;

import java.util.LinkedHashSet;
import java.util.Set;

public class dream11Q_countOptions_DP {

    /**
     * https://leetcode.com/discuss/interview-question/533794/create-k-group-using-n-members
     *
     * You need to create k group using n members. The number of members in ith group should be more than or equal to the members in (i-1)th group. For example 8 members and 4 groups. Then options are [1, 1, 1, 5] [1, 1, 2, 4] [1, 1, 3, 3] [1, 2, 2, 3] [2, 2, 2, 2]
     *
     *
     * 7
     * 3
     * Your Output (stdout)
     * 4
     * Expected Output
     * 4
     */

    public static long countOptions(int people, int groups) {
        // Write your code here
        if(people < groups) {
            return 0;
        }
        int[][] dp = new int[groups+1][people+1];
        for(int i = 1; i <= groups; i++) {
            for(int j = i; j <= people; j++) {
                if(i==j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-i];
                }
            }
        }
        return dp[groups][people];
    }
    public static void main(String[] args) {
        System.out.println(countOptions(7,3));

    }
}
