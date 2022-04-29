package dsageeks;

import java.util.HashSet;

public class TwoSumHashing {
    public static void main(String[] args) {
        int[] arr = {1,5,10,7,6,5};
        findSum(arr,16);
    }

    private static void findSum(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int key:arr) {
            if(set.contains(sum - key))
                System.out.println(key +" :" + (sum-key));
            set.add(key);
        }
    }
}
