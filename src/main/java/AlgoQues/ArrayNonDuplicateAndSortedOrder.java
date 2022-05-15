package AlgoQues;

public class ArrayNonDuplicateAndSortedOrder {
    public static void main(String[] args) {
        long[] ar= {10,20,30,20,30,40,2};

        long[] res= findNonDuplicates(ar);
    }

    private static long[] findNonDuplicates(long[] numbers) {

        long[] res= new long[numbers.length];
        long size = numbers.length;
        long temp = 0;
        boolean flag = true;
        int k=0;

        for(int i=0;i<size;i++){
            temp = numbers[i];
            for(int j=0;j<size;j++){
                if(temp == numbers[j]){
                    if(i != j)
                        //System.out.println("Match found for "+temp);
                        flag = false;
                    break;
                }
            }
            if(flag== true)
                res[k++]=temp;
        }

        sortArray(res, k);
        return res;
    }
    public static void sortArray(long[] array, int count)
    {
        long temporary = 0;

        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        int cnt=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j] ) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

}
