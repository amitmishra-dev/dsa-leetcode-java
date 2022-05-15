package competetive.ArrayProg;

import java.util.ArrayList;
import java.util.List;

public class isSubsequenceArray {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);

        List<Integer> seq = new ArrayList<>();
        arr.add(4);arr.add(3);arr.add(4);

        System.out.println(isValidSubsequence(arr,seq));

    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int i=0;
        int j=0;

        while(i < array.size() && j < sequence.size()){
            if(array.get(i) == sequence.get(j)){
                i++;
                j++;
            }else{
                i++;
            }

        }
        if(j==sequence.size())
            return true;
        else
            return false;
    }
}
