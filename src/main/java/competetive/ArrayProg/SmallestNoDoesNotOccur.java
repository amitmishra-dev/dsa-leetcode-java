package competetive.ArrayProg;

import java.util.Arrays;

public class SmallestNoDoesNotOccur {
    public static void main(String[] args) {
        int[] A ={1,2,3};
        System.out.println(SmallestNoDoesNotOccurInArr(A));
    }
    public static int SmallestNoDoesNotOccurInArr(int[] A) {
        int count=1;
        Arrays.sort(A);
        for(int i=1;i<A.length;i++){
            if(A[i]==count)
                count++;
        }
        return count;
    }
}
