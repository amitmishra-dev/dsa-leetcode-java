package competetive;

import java.util.Arrays;

public class MakeEqualSum {
//    Given two arrays with the size n and m respectively
//    n -> size of first array
//    m -> size of second array
//    You can take any subarray and replace it with the sum of elements , you can perform this operation any number of time in both the arrays.
//    After performing above operation, you have to tell the maximum length of array you can achieve such that the elements present at the index i'th in both the arrays should equal for all such indexes.


    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 1, 1};
        int[] marr = {2, 3, 1};
        System.out.println(countArraySize(arr, marr, arr.length, marr.length));
    }

    static int countArraySize(int[] arr1, int[] arr2, int n, int m) {
        int sumArr1 = Arrays.stream(arr1).sum();//sum
        int sumArr2 = Arrays.stream(arr2).sum();//sum
        int count = 0;
        int i = 1;
        int j = 0;
        int cursum = arr1[0];
        int cursum2 = arr2[0];
        if (sumArr1 != sumArr2)
            return -1;
        while (i<=n-1 && j<=m-1) {
            if (cursum == cursum2) {
                count++;
                if (i < n )
                    cursum = arr1[i++];
                if (j < m )
                    cursum2 = arr2[j++];
            } else if (cursum < cursum2) {
                cursum = cursum + arr1[i];
                i++;
            } else if (cursum > cursum2) {
                cursum2 = cursum2 + arr2[j];
                j++;
            }
        }
        return count;
    }
}
