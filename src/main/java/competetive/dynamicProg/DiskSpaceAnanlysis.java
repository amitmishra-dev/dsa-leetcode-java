package competetive.dynamicProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DiskSpaceAnanlysis {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(6);
        int res= segment(2,list);
        System.out.println(res);
    }
    public static PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    public static int segment(int x, List<Integer> space) {
        // Write your code here
        int n= space.size();

        for(int i=0; i < n-x+1; i++){
            int min= Integer.MAX_VALUE;
            for(int j=i; j<i+x; j++){
                if(space.get(j) < min){
                    min=space.get(j);

                }

            }
            pq.offer(min);
        }
        return pq.peek();
    }
}
