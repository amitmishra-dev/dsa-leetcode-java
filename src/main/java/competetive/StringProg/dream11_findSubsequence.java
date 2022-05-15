package competetive.StringProg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * * Complete the 'findSubsequence' function below.
 *      *
 *      * The function is expected to return an INTEGER_ARRAY.
 *      * The function accepts INTEGER_ARRAY arr as parameter.
 *
 *
 *Input (stdin)
 * 4
 * 1
 * 1
 * 1
 * 3
 * Your Output (stdout)
 * 1
 * 1
 * Expected Output
 * 1
 * 1
 */
public class dream11_findSubsequence {

    public static List<Integer> findSubsequence(List<Integer> arr) {
        // Write your code here
        System.out.println(arr.toString());
        arr=arr.stream().sorted().collect(Collectors.toList());
        List<Integer> sSeqList = new ArrayList<Integer>();
        if(arr.size() >0 && arr.size()<100000) {
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i).equals(arr.get(i + 1))) {
                    sSeqList.add(arr.get(i));
                    //arr.remove(i);
                }
            }
            System.out.println(arr.toString());
            System.out.println(sSeqList.toString());
            if(sSeqList.isEmpty())
                sSeqList.add(-1);

        }
        return sSeqList;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(10000);arr.add(2);arr.add(10000);
        findSubsequence(arr);
    }
}
