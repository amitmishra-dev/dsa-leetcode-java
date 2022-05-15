package competetive.ArrayProg;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/degree-of-an-array/

// https://stackoverflow.com/questions/46560127/find-the-length-of-minimum-sub-array-with-maximum-degree-in-an-array/46754480

public class DegreeOfSubArray {
    public static void main(String[] args) {
        findShortestSubArray(new int[]{1, 2, 3, 2, 1});
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();
        Map<Integer,Integer> stMap=new HashMap<>();
        Map<Integer,Integer> endMap=new HashMap<>();
        int max=0;
        int res=Integer.MAX_VALUE;

        for(int i=0; i< nums.length;i++){

            int key=nums[i];
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);

                if(max <= hm.get(key)){
                    max=hm.get(key);

                }
            }
            else{
                hm.put(key,1);
                stMap.put(key,i);
            }
            endMap.put(key,i);
        }

        if(max==0)
            return 1;
        else{
            for(Integer key : hm.keySet()){
                if(hm.get(key)==max){
                    int len= endMap.get(key)-stMap.get(key)+1;
                    res=Math.min(res,len);
                    System.out.println(key+" :: "+ max+" ::"+res);
                }
            }
        }
        return res;
    }
}
