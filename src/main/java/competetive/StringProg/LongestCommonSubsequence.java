package competetive.StringProg;

public class LongestCommonSubsequence {

    public static int solve(String A, String B) {
        int[][] arr = new int[A.length()][B.length()];
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                arr[i][j]=-1;
            }

        }
        int count= LCS(A, B, 0, 0, arr);
        return count;
    }

    private static int LCS(String a, String b, int i, int j, int [][] arr) {
        if(i >= a.length() || j >= b.length())
            return 0;
        if(arr[i][j] != -1)
            return arr[i][j];
        else{
            if(a.charAt(i)==b.charAt(j)){
                arr[i][j] = 1 + LCS(a, b, i+1, j+1, arr );
                return  arr[i][j];
            }
            else{
                arr[i][j] = Math.max(LCS(a, b, i+1, j, arr), LCS(a, b, i, j+1, arr));
                return arr[i][j];
            }
        }

    }



    public static void main(String[] args) {
        String A="aabbcbc";
        String B="bc";
        System.out.println(solve(A,B));
    }
}
