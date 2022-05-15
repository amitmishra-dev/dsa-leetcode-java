package dsageeks;

public class longestSubarrayZeroAndOne {

    public static void main(String[] args) {
        int[] arr={1,0,0,0,0,0,1};
        System.out.println(longestSubArray(arr));
    }
//todo
//    private static int longestSubArray1(int[] arr) {
//        int ans= Integer.MIN_VALUE;
//        int zcnt=0;
//        int onecnt=0;
//        for (int i = 0; i < arr.length; i++) {
//        ans= Math.max(ans, ans+arr[i]);
//
//        }
//        return ans;
//    }
    private static int longestSubArray(int[] arr) {
    int ans= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int zcnt=0;
            int onecnt=0;
            for (int j = i; j < arr.length; j++) {

                if(arr[j]==1)
                    onecnt++;
                else
                    zcnt++;
                if(zcnt==onecnt)
                    ans= Math.max(ans, zcnt+onecnt);
            }
        }
        return ans;
    }

}
