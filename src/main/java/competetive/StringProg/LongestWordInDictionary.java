package competetive.StringProg;

import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public static void main(String[] args) {
        String[] word = {"world","w","wo","wor","worl","banana"};
        System.out.println(longestWord(word));
    }
    public static String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        String res="";
        int longestStr= 0;
        for(String s: words){
            //for(int i=0;i<s.length();i++){
                if(longestStr < s.length() &&!set.contains(s)){
                    set.add(s);
                    longestStr=s.length();
                    res=s;

                }
            }
        return res;
        }

    }

