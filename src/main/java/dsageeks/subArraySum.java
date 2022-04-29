package dsageeks;

import java.util.ArrayList;
import java.util.List;

public class subArraySum {
    public static void main(String[] args) {
        int[] arr= {5,-4,2,2};//{10,-1,-2,-1,-3,4,5};
        System.out.println(findMaxSubArrayEffiecient(arr));
    }

    private static int findMaxSubArray(int[] arr) {//O(n2)
        List<Integer> res= new ArrayList<>();
        int resSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int curSum=0;
            for (int j = i; j < arr.length; j++) {
                curSum+=arr[j];
                if(curSum>resSum)
                    resSum=curSum;
            }
        }
        return resSum;
    }

    private static int findMaxSubArrayEffiecient(int[] arr) {// time complexity - O(n)
        int curSum=0;
        int resSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            curSum= Math.max(arr[i],curSum+arr[i]);
            resSum= Math.max(resSum,curSum);
        }
        return resSum;
    }
}
