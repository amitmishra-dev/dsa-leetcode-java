package competetive.dynamicProg;

public class AllPalindromeSubstring {
    public static void main(String[] args) {
        String s ="abccbc";
        int c =findAllPalindromeSubstring(s);
        System.out.println(c);
    }

    private static int findAllPalindromeSubstring(String s) {
        int c=0;
        boolean dp[][]= new boolean[s.length()][s.length()];
        for (int g = 0; g <s.length() ; g++) {
            for (int i = 0, j = g;j<dp.length;j++,i++){

                if(g==0){
                    dp[i][j]=true;
                    c++;
                }else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                        c++;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        c++;
                    }
                }

            }
        }
        return c;

    }
}
