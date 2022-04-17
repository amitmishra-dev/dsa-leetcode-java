package competetive.ArrayProg;

import java.util.HashSet;
import java.util.Set;

public class checkSum {
    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        // write your code here
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++ ){
            if(!set.contains((n-arr[i])))
                set.add((arr[i]));
            else {
                result[0]= n-arr[i];
                result[1]= arr[i];
            }

        }
        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String[] args) {
        int[] arr ={4,16,34,6,9,22};
        int[] res= findSum(arr, 26);
        System.out.println(res[0]+ ":: "+res[1]);
    }
}
