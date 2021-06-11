package competetive;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={10,3,7,14,15};
        System.out.println("==>>>: "+NGE(arr));
    }

    private static int[] NGE(int[] arr) {

        Stack<Integer> stack= new Stack<>();
        int[] res= new int[arr.length];
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] <= arr[i-1]){
                stack.push(i);
            }
            else if(arr[i] > arr[i-1]){
                res[i-1]=arr[i];
                if(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                    while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                        res[stack.peek()]=arr[i];
                        stack.pop();
                    }
                    if(!stack.isEmpty()&& arr[stack.peek()] > arr[i]) {
                        stack.push(i);
                    }
                }
            }

        }
        while(!stack.isEmpty() ){
            res[stack.peek()]=-1;
            stack.pop();
        }
        Arrays.stream(res).forEach(System.out::println);
        return res;
    }
}
