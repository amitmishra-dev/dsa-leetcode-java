package competetive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class HeapKMinSum {
    public static void main(String[] args) {
        int[] num1 = {1, 5, 9};
        int[] num2 = {1, 2, 4};
        int k = 3;
        List<List<Integer>> kMin= findSmallestSum(num1, num2, k);
        for (int i = 0; i <kMin.size() ; i++) {{
            kMin.get(i).stream().forEach(System.out::print);
        }

        }
    }

    private static List<List<Integer>> findSmallestSum(int[] nums1, int[] nums2, int k)
    {


        PriorityQueue<List<Integer>> pq= new PriorityQueue<>((a,b)-> (a.get(0)+a.get(1)) -(b.get(0)+b.get(1)));
        List<List<Integer>> res= new ArrayList();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j < nums2.length;j++){
                pq.offer(Arrays.asList(nums1[i],nums2[j]));
            }
        }
        while(k-- > 0 && !pq.isEmpty()){
            List<Integer> kList= pq.poll();
            res.add(kList);
        }
        return res;



//        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b)-> (a.get(0)+a.get(1))-(b.get(0)+ b.get(1)));
//
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                pq.offer(Arrays.asList(nums1[i],nums2[j]));
//            }
//        }
//        List<List<Integer>> l= new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            List<Integer> res= pq.poll();
//            l.add(res);
//        }
//        return l;
    }
}