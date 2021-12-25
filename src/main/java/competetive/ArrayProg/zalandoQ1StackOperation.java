package competetive.ArrayProg;

import java.util.Stack;

public class zalandoQ1StackOperation {
    public static void main(String[] args) {
        String s= "1048575 DUP +";
        System.out.println(StackOperation(s));
    }

    private static int StackOperation(String S) {
        String[] splitStr = S.split("\\s+");
        Stack<String> stack = new Stack<>();
        for (String strOperation : splitStr){

            if(stack.isEmpty() && ( strOperation.equals("DUP") || strOperation.equals("POP")))
                return -1;

            if(stack.size()<2 && ( strOperation.equals("+") || strOperation.equals("-")))
                return -1;
            if(strOperation.equals("+")  ) {
                stack.push(String.valueOf(Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop())));
                continue;
            }
            if(strOperation.equals("-")  ) {
                stack.push(String.valueOf(Integer.valueOf(stack.pop()) - Integer.valueOf(stack.pop())));
                continue;
            }
            if(strOperation.equals("DUP")  ) {
                stack.push(stack.peek());
                continue;
            }
            if(strOperation.equals("POP")  ) {
                stack.pop();
                continue;
            }
            if(Integer.parseInt(strOperation)<= 2000)
                stack.push(strOperation);
        }
        return Integer.valueOf(stack.peek());
    }



//    public static String SmallestNoDoesNotOccurInArr(String S) {
//        int[] occurrences = new int[26];
//        for (char ch : S.toCharArray()) {
//            occurrences[ch - 'a']++;
//        }
//
//        char best_char = 'a';
//        int  best_res  = 0;
//
//        for (int i = 0; i < 26; i++) {
//            if (occurrences[i] >= best_res && occurrences) {
//                best_char = (char)((int)'a' + i);
//                best_res  = occurrences[i];
//            }
//        }
//
//        return Character.toString(best_char);
//    }
}
