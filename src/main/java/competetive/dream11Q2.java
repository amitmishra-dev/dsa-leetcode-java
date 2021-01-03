package competetive;

import java.util.*;
import java.util.stream.Collectors;

public class dream11Q2 {

    /**
     *      * Complete the 'findSmallestDivisor' function below.
     *      *
     *      * The function is expected to return an INTEGER.
     *      * The function accepts following parameters:
     *      *  1. STRING s
     *      *  2. STRING t
     *
     *Input (stdin)
     * lrbb
     * lrbb
     * Your Output (stdout)
     * 4
     * Expected Output
     * 4
     */

    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        System.out.println(s.substring(0,t.length()));
//        String subs=s.substring(0,t.length());
//        if(subs.equals(t))
//            s=s.replace(0,t.length());
        int count=0;
        if(s.length()>0 &&s.length()<2*100000) {
            while (s.length() >= t.length()) {
                if(s.contains(t))
                    s = s.replaceFirst(t, "");
                else
                    break;
            }
        }
        String tl;
        if(s.isEmpty()) {
            count = removeDuplicates(t);
        }
        else
            count=-1;
        return count;
    }

    private static int removeDuplicates(String t) {

        Set<Character> set;
        set = new LinkedHashSet<Character>();
        for(char c:t.toCharArray())
        {
            set.add(Character.valueOf(c));
        }
        if(t.length() % set.size()==0){
            System.out.println("size:: " +set.size() + ":: " + t.length());
            return set.size();
        }
        else return t.length();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestDivisor("abcabc","abc"));

    }
}
