package competetive.StringProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class palindromeLongest {
    public static void main(String[] args) {
//        Input: s = "Abccccdd"
//        Output: 7
//        Explanation:
//        One longest palindrome that can be built is "dccaccd", whose length is 7.
        String s = "aAa";
        int res=calculateLongestPalindrome(s);
        System.out.println(res);
    }

    private static int calculateLongestPalindrome(String s) {
        Map<Character,Integer> hm= new HashMap<>();
        int countUpperCase=0;
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        boolean flag=false;
        for (Map.Entry<Character,Integer> e : hm.entrySet()){
            if(Character.isUpperCase(e.getKey())||Character.isLowerCase(e.getKey())) {
                int val = e.getValue();

                if (val%2==0)
                    countUpperCase = countUpperCase + e.getValue();
                else if(val%2==1)
                    flag=true;
            }
        }
        if(countUpperCase>0)
            return flag==true?1+countUpperCase:countUpperCase;
        else
            return 0;
    }
}

//3rd higest salary of each dept
//emp (id , name , salary ,dept)
//select eid, salary from (
// select salary from emp order by
// )
