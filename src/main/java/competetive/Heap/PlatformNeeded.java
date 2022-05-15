package competetive.Heap;

import java.util.Arrays;

public class PlatformNeeded {
    public static void main(String[] args) {
        int[]  arr={910, 1100, 1230, 1200,900};
        int[] dep={920, 1260, 1400, 1260,1600};

        System.out.println("=====> Platform :: "+ NoOfPlatformNeeded(arr,dep));
    }

    private static int NoOfPlatformNeeded(int[] arr, int[] dep) {
        int result=1;
        int max_platform=1;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1; int j=0;
        while(i< arr.length && j < dep.length){
            if(arr[i]  <  dep[j]){
                System.out.println("platform++");
                max_platform++;
                i++;
            }else{
                if(max_platform>=0) {
                    System.out.println("platform --");
                    max_platform--;
                }
                j++;
            }

            if(max_platform > result){
                result=max_platform;
                System.out.println("updated no of platform needed" + result);
            }
        }
        return result;
    }
}
