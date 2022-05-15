package dsageeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class longestSubsttringWithoutRepeating {
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeating("abaacdefghijka"));
    }

    private static int longestSubstringWithoutRepeatingold(String geeksforgeeks) {
        Set<Character> hmap= new HashSet<>() ;
        int max=0;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < geeksforgeeks.length(); i++) {
            char ch= geeksforgeeks.charAt(i);
            if(hmap.contains(ch))
                max=2;
            else {
                hmap.add(ch);
                max++;
                ans= Math.max(ans,max);

            }
        }
        return ans;
    }
    private static int longestSubstringWithoutRepeating(String geeksforgeeks) {
        Map<Character,Integer> hmap= new HashMap<>() ;
        int ans=Integer.MIN_VALUE;
        int s=0;int e=0;
        while(e < geeksforgeeks.length()) {
            char ch= geeksforgeeks.charAt(e);
            if(!hmap.containsKey(ch)) {
                hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
                ans= Math.max(ans,e-s+1);
                e++;
            }
            else {
                    hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
                    while(s<=e && hmap.get(ch)>1){
                        char charstart = geeksforgeeks.charAt(s);
                        hmap.put(charstart,hmap.get(charstart)-1);
                        s++;
                    }
            }
        }
        return ans;
    }
}
