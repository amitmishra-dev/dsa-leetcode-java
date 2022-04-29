package competetive.ArrayProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class slidingWindowSizeK {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        maxSlidingWindowQueue(nums,k);
    }
    public static int[] maxSlidingWindowQueue(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        res.add(pq.peek());

        for(int i=1;i<=nums.length-k;i++){

            pq.remove(nums[i-1]);
            pq.add(nums[i+2]);

            res.add(pq.peek());

        }
        int[] resArray= res.stream().mapToInt(x->x).toArray();
        //int[] resArray= Arrays.stream(res).mapToInt(x->x).toArray();
        return resArray;
    }


}
