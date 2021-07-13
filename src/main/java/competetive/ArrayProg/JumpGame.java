package competetive.ArrayProg;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums={1,5,0,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] arr) {
        int len= arr.length;
        int reachable=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > 0  && reachable < len && reachable < arr[i] ){
                reachable=arr[i];
                System.out.println("reachable: "+reachable);
            }else if (arr[i]==0 && reachable<=i){
                return false;
            }
        }
        return true;
    }
}
