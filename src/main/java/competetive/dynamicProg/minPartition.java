package competetive.dynamicProg;

import java.util.Collections;
import java.util.List;

public class minPartition {
    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {

        // Write your code here
        int len=used.size();
        int sum=0;
        int count=0;
        Collections.sort(totalCapacity);
        Collections.reverse(totalCapacity);
        int[] usedArr=new int[len];
        int[] totArr=new int[len];
        for(int i=0;i<len;i++)
        {
            usedArr[i]=used.get(i);
            totArr[i]=totalCapacity.get(i);
            sum=sum+usedArr[i];
        }
        for(int j=0;j<len;j++)
        {
            sum=sum-totArr[j];
            count++;
            if(sum<=0)
            {
                break;
            }
        }
        return count;

    }
}
