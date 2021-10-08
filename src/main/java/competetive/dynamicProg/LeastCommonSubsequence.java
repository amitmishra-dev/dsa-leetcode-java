package competetive.dynamicProg;

import java.util.HashMap;
import java.util.Map;

public class LeastCommonSubsequence {
    static Map<String,Integer> cache= new HashMap<>();
    public static void main(String[] args) {
        String s1 = "abbcdgfab";
        String s2 = "bbadcgfa";

        solve(s1, s2);

    }



    private static void solve(String s1, String s2) {

        int max = LCS(s1, s2, 0, s1.length() , 0, s2.length(),0 );
        System.out.println(max);
    }

    private static int LCS(String s1, String s2, int i, int length, int i1, int length1,int res) {

        if (i >= length || i1 >= length1) {
            return 0;
        }
        StringBuilder sb= new StringBuilder();
        String key=sb.append(i).append(i1).toString();
        if(cache.containsKey(key))
            return cache.get(key);
        else {
            if (s1.charAt(i) == s2.charAt(i1)) {
                 res= 1 + LCS(s1, s2, i + 1, length, i1 + 1, length1,res);
            } else {
                 res= Math.max(LCS(s1, s2, i + 1, length, i1, length1,res), LCS(s1, s2, i, length, i1 + 1, length1,res));
            }
            cache.put(key,res);

        }
        return res;
    }

    // with array memory;

//    public class Solution {
//        public static int solve(String A, String B) {
//            int[][] arr = new int[A.length()][B.length()];
//            for (int i = 0; i < A.length(); i++) {
//                for (int j = 0; j < B.length(); j++) {
//                    arr[i][j]=-1;
//                }
//
//            }
//            int count= LCS(A, B, 0, 0, arr);
//            return count;
//        }
//====>>>        Soln
//    private static int LCS(String a, String b, int i, int j, int [][] arr) {
//        if(i >= a.length() || j >= b.length())
//            return 0;
//        if(arr[i][j] != -1)
//            return arr[i][j];
//        else{
//            if(a.charAt(i)==b.charAt(j)){
//                arr[i][j] = 1 + LCS(a, b, i+1, j+1, arr );
//                return  arr[i][j];
//            }
//            else{
//                arr[i][j] = Math.max(LCS(a, b, i+1, j, arr), LCS(a, b, i, j+1, arr));
//                return arr[i][j];
//            }
//        }
//
//    }
}