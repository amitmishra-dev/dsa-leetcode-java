package competetive.ArrayProg;

import java.util.ArrayList;
import java.util.List;

public class AddThreeSum {
        private static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
            // Write your code here.
            int sum=0;
            List<Integer[]> intList= new ArrayList<Integer[]>();
            for (int i=0;i< array.length -2; i++){
                for (int j = i+1; j < array.length -1; j++) {
                    for (int k = j+1; k <= array.length -1; k++) {
                        sum= array[i]+array[j]+array[k];
                        System.out.println("sum: "+sum);
                        if(sum == targetSum ) {
                            System.out.println("sum = target");
                            Integer[] arr = new Integer[3];
                            arr[0]=array[i];
                            arr[1]=array[j];
                            arr[2]=array[k];
                            intList.add(arr);
                        }
                    }
                }
            }
            if(intList.size()>0)
                return intList;
            else
                return new ArrayList<Integer[]>();
        }

        public static void main(String[] args) {
            int[] arr ={1,2,-3};
            List<Integer[]> arrq =threeNumberSum(arr,0);
            System.out.println(arrq.size());
        }

}
