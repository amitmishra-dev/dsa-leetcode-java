package competetive.StringProg;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> treeMap = new TreeMap<>();
        for(int i=0; i < s.length();i++)
        {
            treeMap.put(s.charAt(i),treeMap.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i=0; i < t.length();i++)
        {
            if(treeMap.containsKey(t.charAt(i)) && treeMap.get(t.charAt(i)) >0)
                treeMap.put(s.charAt(i),treeMap.getOrDefault(s.charAt(i),0) - 1);
            else
                return false;
        }
        List<Integer> list = treeMap.entrySet().stream().filter(e->e.getValue() >0).map(e->e.getValue()).collect(Collectors.toList());
        if(list.size()==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ab","ba"));
    }
}
