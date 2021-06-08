package AlgoExpert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoNoSum {
    private static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int i=0;
        int j = array.length  -1;
        int[] resultArr = null;
        if(j>1)
            resultArr = new int[2];
        Arrays.sort(array);
        while(i < j){
            int sum = array[i] + array[j];
            if(sum == targetSum) {
                resultArr[0] = array[i];
                resultArr[1] = array[j];
                return resultArr;
            }
            if(sum > targetSum){
                j--;
            }
            if(sum < targetSum){
                i++;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr ={};//{1,2,-3,6,-4};
        Arrays.sort(arr);
        int[] resArr =twoNumberSum(arr,9);
        System.out.println(resArr);
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(resArr[i]);
        }
    }
}
