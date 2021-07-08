package competetive.dynamicProg;

import java.util.PriorityQueue;

public class kSortedHeap {

    public static void main(String[] args) {
        int[] arr={2,1,3,5,12};
        System.out.println(sortKSortedArray(arr,3));
    }
        public static int[] sortKSortedArray(int[] array, int k) {
            // Write your code here.
            PriorityQueue<Integer> pq= new PriorityQueue();
            for(int i=0;i<array.length;i++){
                pq.offer(array[i]);
            }
            int[] res= new int[array.length];
            int m=0;
            while(!pq.isEmpty()){
                System.out.println(pq.peek());
                res[m++]=pq.poll();
            }
            return res;
        }

}
