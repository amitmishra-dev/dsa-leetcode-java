package competetive.StringProg;

public class palindromeRecursive {
    // Write your code here.sas
    public static void main(String[] args) {
        String s= "abcccba";
        boolean res=isPalindrome(s,0,s.length()-1);
        System.out.println("Res:" + res);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if(i==j)
            return true;
        if(s.charAt(i)!=s.charAt(j))
            return false;
        if(i<j)
            return isPalindrome(s, i+1, j-1);
        return true;
    }
}
