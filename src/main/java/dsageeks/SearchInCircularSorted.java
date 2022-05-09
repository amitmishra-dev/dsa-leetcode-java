package dsageeks;

public class SearchInCircularSorted {
    public static void main(String[] args) {
        int[] arr= {5,6,7,1,2,3,4};
       // findKInArr(arr, 3);
        int index= findKinCircularSorted(arr,0, arr.length-1,6);
        System.out.println(index+" :: "+arr[index]);
    }

//5 6 7 8 9 1 2 3 4
    private static int findKinCircularSorted(int[] arr, int l, int h, int val) {
        int mid=0;
        while(l<=h){
            mid=  (h+l)/2;
            if(arr[mid] == val)
                return mid;
            else if(arr[mid]>arr[l]){
                if(val > arr[l] && val < arr[mid]){
                    h=mid;
                }
                else
                    l = mid +1;
            }
            else{
                if(val > arr[mid] && val < arr[h])
                    l = mid + 1;
                else
                    h = mid;
            }

        }
        return -1;
    }

}
