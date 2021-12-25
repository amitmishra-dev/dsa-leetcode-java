package competetive.ArrayProg;

import java.util.Stack;

public class zalandoQ3SmallestOccurences {
    public static void main(String[] args) {
        String s= "zzzaaa";
        System.out.println(SmallestNoDoesNotOccurInArr(s));
    }


    public static String SmallestNoDoesNotOccurInArr(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < S.length(); i++) {
            if (occurrences[S.charAt(i) - 'a'] > best_res) {
                best_char = S.charAt(i);
                best_res = occurrences[S.charAt(i) - 'a'];
            }
        }

        return Character.toString(best_char);
    }
}
