package competetive.ArrayProg;

public class findPeakElement {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        System.out.println(findPeakElement(nums));

    }

    public static int findPeakElement(int[] nums) {
        int l=0;
        int r= nums.length-1;

        while(l < r){
            int mid= (l+r)/2 ;
            if(nums[mid] > nums[mid+1])
                r= mid;
            else
                l= mid+1;
        }
        return l;
    }

    public static int findPeakElement1(int[] nums) {
            for (int i=1;i<=nums.length -2 ;i++){
                //            if(nums[i])
                if(nums[i] > nums[i+1])
                    return i;
            }
            return -1;
        }

}
