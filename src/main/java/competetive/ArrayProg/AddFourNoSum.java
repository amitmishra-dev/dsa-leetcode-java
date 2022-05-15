package competetive.ArrayProg;
import java.util.*;
public class AddFourNoSum {

    static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int l=0;
        int r=array.length -1;
        int sum=Integer.MIN_VALUE;
        Arrays.sort(array);
        ArrayList<Integer[]> intList= new ArrayList<>();
        for (int i = 0; i < array.length-3; i++) {
            for (int j = i+1; j < array.length-2 ; j++) {
                l=j+1;
                r=array.length -1;
                while(l < r){
                    sum=array[i]+array[j]+array[l]+array[r];
                    System.out.println("sum: "+sum);
                    if(sum==targetSum){
                        System.out.println("sum== target");
                        Integer[] intA= new Integer[4];
                        intA[0]=array[i];
                        intA[1]=array[j];
                        intA[2]=array[l];
                        intA[3]=array[r];
                        intList.add(intA);
                        l++;
                        r--;
                    }
                    else if(sum < targetSum){

                        l++;
                    }
                    else
                        r--;
                 }
            }

        }
        if(intList.size()>0)
            return intList;
        return new ArrayList<Integer[]>();
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,4,2,6,-5};
        List<Integer[]> size=fourNumberSum(arr,4);
        size.stream().forEach(System.out::println);
        System.out.println("***** Printed four number sum ******* "+ size.size());
    }
}
