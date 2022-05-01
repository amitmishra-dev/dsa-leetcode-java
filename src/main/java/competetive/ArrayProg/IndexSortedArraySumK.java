package competetive.ArrayProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IndexSortedArraySumK {
    public static void main(String[] args) {
        int[] array = {2,7,11,15}; int  K = 9;
        List<int[]> res =IndexSortedArrayOfSumK(array,K);
        for (int i = 0; i < res.size() ; i++) {
            System.out.println(res.get(i)[0]+ ", "+ res.get(i)[1]);
        }
    }

    private static List<int[]> IndexSortedArrayOfSumK(int[] array, int k) {
        HashMap<Integer,Integer> sumMap= new HashMap<>();
        List<int[]> res= new ArrayList<>();
        for (int i=0;i< array.length;i++) {
            if(!sumMap.containsKey(k-array[i]))
                sumMap.put(array[i],i );
            else
                res.add(new int[]{sumMap.get(k-array[i]),i});
        }
        return res;
    }
}
