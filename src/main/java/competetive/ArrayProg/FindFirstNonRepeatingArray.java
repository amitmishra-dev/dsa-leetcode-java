package competetive.ArrayProg;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingArray {
    static Map<Integer, Integer> hmap= new LinkedHashMap<>();
    public static void main(String[] args) {
        int[] arr ={4,6,7,7,6};
        findNonRepeat(arr, hmap);
    }

    private static Integer findNonRepeat(int[] arr, Map<Integer, Integer> hmap) {
        for (int ele: arr) {
            //if (!hmap.containsKey(ele)){
                hmap.put(ele, hmap.getOrDefault(ele,0)+1);
            //}
        }
        List<Integer> list = hmap.entrySet().stream().filter(e->e.getValue().equals(1)).map(Map.Entry::getKey).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        for(int ele : arr){

            hmap.put(ele, hmap.getOrDefault(ele,0)+1);
        }
        List<Integer> result =hmap.entrySet().stream().filter(e->e.getValue().equals(1)).map(e->e.getKey()).collect(Collectors.toList());//Map(Entry::GetKey, Entry::GetValue)));
        return result.get(0);

    }
}
