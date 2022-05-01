package dsageeks;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AnagramHashing {
    public static void main(String[] args) {
        System.out.println(checkAnagram("cara", "arc"));
    }

    private static boolean checkAnagram(String car, String arc) {
        HashMap<Character,Integer> hmap= new HashMap<>();
        for(Character key: car.toCharArray()){
                hmap.put(key, hmap.getOrDefault(key,0)+1);

        }
        for(Character key: arc.toCharArray()){
            if(hmap.containsKey(key))
            hmap.put(key, hmap.get(key)-1);
        }
        Collection<Integer> res = hmap.values();
        for (int s:res) {
            if(s!=0)
                return false;

        }
    return true;

    }
}
