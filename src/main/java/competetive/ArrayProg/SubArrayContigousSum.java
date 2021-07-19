package competetive.ArrayProg;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. Subarray Sum Equals K
 * Medium
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 8202
 *
 * 274
 *
 * Add to List
 *
 * Share
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 */
public class SubArrayContigousSum {
    public static void main(String[] args) {
        int res=subarraySum(new int[]{1, 2, 3, 1},3);
        System.out.println(res);
    }
    static Map<Integer,Integer> hMap= new HashMap<>();
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        hMap.put(0,1);
        for(int num : nums){
            sum+=num;
            if(hMap.containsKey(sum-k)){
                count+=hMap.get(sum-k);
            }
            hMap.put(sum,hMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
