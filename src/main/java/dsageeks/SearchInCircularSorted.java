package dsageeks;

public class SearchInCircularSorted {
    public static void main(String[] args) {
        int[] arr= {5,6,7,1,2,3,4};
       // findKInArr(arr, 3);
    }

//    private static void findKInArr(int[] arr, int val) {
//
//        int l= 0;
//        int h= arr.length;
//        int mid=  l+ (h-l)/2;
//        while(l<h){
//            int mid= l+ (h-l)/2;
//            if(arr[mid] == val)
//                return mid;
//            else {
//                if (val < arr[mid]) {
//                    l = mid;
//                }
//            }
//        }
//    }

    private static int binarySearch(int[] arr, int l, int h, int val) {

        while(l<h){
            int mid= l+ (h-l)/2;
            if(arr[mid] == val)
                return mid;
            else if(arr[mid] > val){
                l=mid;
            }
            else
                h=mid-1;
        }
        return -1;
    }

}
