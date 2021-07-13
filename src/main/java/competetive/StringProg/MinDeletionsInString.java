package competetive.StringProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinDeletionsInString {
    static Map<Character,Integer> hmap= new HashMap<>();
    public static void main(String[] args) {
        String s = "aabbbccc";
        int res= minDeletion(s);
        System.out.println(res);
    }

    private static int minDeletion(String s) {
        int cnt=0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),1);
            }else {
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            }
        }
        for (Character key:hmap.keySet()){
            int  val= hmap.get(key);
            if(!set.contains(val)){
                set.add(val);
            }else{
                while (set.contains(val) && val-- >0){

                    cnt++;
                }
                set.add(val);
            }
        }
        return cnt;
    }
}
