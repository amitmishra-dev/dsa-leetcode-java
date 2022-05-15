package competetive.StringProg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumberFormation {
//    https://www.youtube.com/watch?v=qEIGhVtZ-sg
    private static String largestNumberFormation(int[] arr) {
        String strA="";
        String strB="";
        String result="";
        for (int i = 0; i < arr.length; i++) {
            for(int j= i+1; j< arr.length;j++){
                strA= strA.concat(String.valueOf(arr[i])).concat(String.valueOf(arr[j]));
                strB= strB.concat(String.valueOf(arr[j])).concat(String.valueOf(arr[i]));

                System.out.println("strA: "+ strA + " StrB:  " +strB);
                if(Integer.valueOf(strB) > Integer.valueOf(strA)){
                    int temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    Arrays.stream(arr).forEach(System.out::println);
                }
            }
        }
        return (Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr= {30,3,90};
        System.out.println("largest  string : "+largestNumberFormation(arr));
    }


}
