package competetive.dynamicProg;

public class minDistance {
// https://leetcode.com/problems/minimum-distance-to-the-target-element/
    public static int getMinDistance(int[] arr, int target, int start) {
        int minDist=Integer.MAX_VALUE;
        if(start> arr.length)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                if(minDist>Math.abs(i-start))
                    minDist= Math.abs(i-start);
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
//        Input: nums = [1,2,3,4,5], target = 5, start = 3
//        Output: 1
//        Explanation: nums[4] = 5 is the only value equal to target, so the answer is abs(4 - 3) = 1.
        int[] arr= {2,4,5,6,8,6};
        System.out.println(getMinDistance(arr, 6,1));
    }
}
