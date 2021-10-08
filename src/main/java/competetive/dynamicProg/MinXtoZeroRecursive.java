package competetive.dynamicProg;


import java.util.HashMap;
import java.util.Map;

public class MinXtoZeroRecursive {

    private static Map<String,Integer> hMap= new HashMap();
    public static void main(String[] args) {
        int x=15;
        int[] arr={1,1,1,1,1,10,2,13};
        int count=convertXtoZeroRecursive(arr,x,0,arr.length-1, 0);
        count= count==Integer.MAX_VALUE?-1:count;
        System.out.println(count);
        //System.out.println(convertXtoZeroRecursive(arr,x,0,arr.length-1, 0));
    }

    private static int convertXtoZeroRecursive(int[] arr, int x, int l, int r, int count) {
       StringBuilder sb= new StringBuilder();
       String key=sb.append(x).toString();
       if(hMap.containsKey(key)){
            return hMap.get(key);
       }
        if(x==0)
            return count;
        if(l>r||x<0)
            return Integer.MAX_VALUE;

        int res= Math.min(convertXtoZeroRecursive(arr, x-arr[l], l+1, r, count+1), convertXtoZeroRecursive(arr, x-arr[r], l, r-1, count+1));
        hMap.put(key,res);
        return res;
    }
}
