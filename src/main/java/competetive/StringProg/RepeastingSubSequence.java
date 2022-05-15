package competetive.StringProg;

import java.util.ArrayList;
import java.util.List;

public class RepeastingSubSequence {

    public static int anytwo(String A) {
        String subSeq=RSS(A,0,2, "");
        System.out.println("sub sq: "+ subSeq);
        if(subSeq.length()>=2)
            return subSeq.length();
        else
            return 0;
    }

    private static String RSS(String a, int i, int j, String fs) {

        if(i>=a.length() || j>=a.length())
            return "";

        if(a.charAt(i)==a.charAt(j)  ){
            fs=fs.concat(String.valueOf(a.charAt(i)));
            System.out.println("sub seq: "+fs.length());
            fs=fs+RSS(a,i+1,j+1,fs);
            System.out.println("sub seq 2: "+fs.length());

            if(fs.length()>=2)
                return fs;
        }
        else {
            fs = RSS(a, i + 1, j + 1, "");
        }
        return fs;
    }

    public static void main(String[] args) {
        System.out.println(anytwo("abab"));
    }

    public static class RearrageBasedOnK {
        public static void main(String[] args) {
            int[] arr= {10,2,3,4,8}; // 2 3 4 10 8
            int k = 5;
    //
    //        2  3  4 8 10
    //
    //        int i = 0; int j= i+1;
    //
    //
    //        2 10
    //
    //
    //        k 8 3 4 2 10 8
    //                   4
            // two arraylist
            // listGreaterThanK (arr[i] > k)  - 10 8
            // listSmallerThanK (arr[i] <= K) - 2 3 4  listSmallerThanK.addAll(listGreaterThanK);

            List<Integer> res =sortByK(arr, k);
            res.stream().forEach(System.out::println);
        }

        private static List<Integer> sortByK(int[] arr, int k) {

            List<Integer> listSmallerThanK = new ArrayList<>();
            List<Integer> listGreaterThanK = new ArrayList<>();

            for (int ele: arr) {
                if(ele > k){
                    listGreaterThanK.add(ele);
                }
                else
                    listSmallerThanK.add(ele);
            }
            listSmallerThanK.addAll(listGreaterThanK);
            return listSmallerThanK;
        }
    }
}