package dsageeks;

public class FindNotDuplicated {
    public static void main(String[] args) {
        int[] arr= {1,2,1,4,2};
        System.out.println(findnonduplicatedXor(arr));
    }

    private static int findnonduplicatedXor(int[] arr) {
        int ans=0;
        for (int ele:arr
             ) {
            ans= ans^ele;
        }
        return ans;
    }
}
