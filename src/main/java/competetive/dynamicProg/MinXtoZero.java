package competetive.dynamicProg;

public class MinXtoZero {
    public static void main(String[] args) {
        int x=5;
        int[] arr={11,1,4,2,13};
        System.out.println(convertXtoZero(arr,x));
        //System.out.println(convertXtoZero(arr,x,0));
    }
    //sliding window
    private static int convertXtoZero(int[] nums, int x) {
        int n=nums.length; int sum=0;
        for(int i:nums) sum+=i;
        sum=sum-x;
        if(sum==0) return n;
        int i=0,curSum=0,ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            curSum+=nums[j];
            while(i<j && curSum>sum){
                curSum-=nums[i]; i++;
            }
            if(curSum==sum) ans=Math.min(ans,n-(j-i)-1);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    private static int convertXtoZero(int[] arr, int x,int index) {

        int i=0;
        int j= arr.length-1;
        int count=0;
        while(i<=j && x >0) {
            if(x==0)
                return count;
            else if (arr[j] > x && arr[i]>x) {
                System.out.println(arr[i] + " : " +arr[j]);
                return -1;
            }
            else if (arr[i] >= arr[j] && arr[i] <= x || arr[i]<=x && arr[j]>x) {
                x = x - arr[i];
                i++;
                System.out.println(count++ +"; x: "+x);
            } else if (arr[j] > arr[i] && arr[j] <= x|| arr[j]<=x && arr[i]>x) {
                x = x - arr[j];
                j--;
                System.out.println(count++ +"; x: "+x);
            }
        }

            return count;


    }
}
