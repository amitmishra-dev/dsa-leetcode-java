package dsageeks;

public class CircularSubArraySum {


    public static void main(String[] args) {
        int[] arr = {-2,1,-5,-4};
        System.out.println(findMaxSumCircular(arr));
    }

    private static int findMaxSumCircular(int[] arr) {

        int globalSum= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            int curSum=0;
            for (int j = i; j < arr.length; j++) {
                curSum+=arr[j];
                globalSum= Math.max(curSum,globalSum);
            }
            for (int k = 0; k < i; k++) {
                curSum+=arr[k];
                globalSum= Math.max(curSum,globalSum);
            }

        }
        return globalSum;
    }
}
