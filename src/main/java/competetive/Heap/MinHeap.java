package competetive.Heap;

import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr= {12,4,55,6,50,8};
        Arrays.stream(arr).forEach(e-> System.out.print(" "+ e));
        int[] result = new MinHeap().buildMinHeap(arr);
        System.out.println("\n===================================");
        Arrays.stream(result).forEach(e-> System.out.print(" "+ e));

    }

    private int[] buildMinHeap(int[] heapArr) {
        for (int i = (heapArr.length-1)/2; i >=0; i--) {
            heapify(heapArr,i, heapArr.length );

        }
        return heapArr;
    }

    private void heapify(int[] heapArr, int index, int size) {
        int smallest= index;
        //while(index <size/2) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;

            if (leftIndex <= size && heapArr[leftIndex] < heapArr[smallest])
                smallest = leftIndex;

            if (rightIndex <= size && heapArr[rightIndex] < heapArr[smallest])
                smallest = rightIndex;

            if (smallest != index) {
                int temp = heapArr[index];
                heapArr[index] = heapArr[smallest];
                heapArr[smallest] = temp;

                index = smallest;
                heapify(heapArr, index,size);
            } else
                return;
             //   break;
        //}
    }
}
