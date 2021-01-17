package competetive;

public class BinarySearch {

    public static void main(String[] args) {
        int [] testArr = new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        System.out.println(binarySearch(testArr, target));
    }

    private static int binarySearch(int[] testArr, int target) {
        return recursive(testArr,target,0,testArr.length -1);
        //return iterative(testArr, target);
    }

    // time : O(log n) | space: O(1)
    private static int iterative(int[] testArr, int target) {
        int first = 0;
        int last = testArr.length - 1;
        while(first <= last)
        {
            int middle = (first + last) / 2;

            if (testArr[middle] == target) { return middle; }
            else if (testArr[middle] < target) { first = middle + 1;}
            else { last = middle - 1;}
        }
        return -1;
    }

    // time : O(log n) | space : O(log n) - recursive stack
    public static int recursive(int[] array, int target, int first, int last){
        if (first > last) {return -1;}
        int middle = (first + last) / 2;
        if (array[middle] == target) { return middle; }
        else if (array[middle] < target) { first = middle + 1;}
        else { last = middle - 1; }

        return recursive(array, target, first, last);
    }

}
