package competetive.StringProg;

import java.util.Stack;
//https://leetcode.com/problems/remove-k-digits/
public class SmallestNoFormation {
    public static void main(String[] args) {
        int num= 123;
        int k=2;

        String res= buildSmallestNo(num,k);
        System.out.println(res);
    }

    private static String buildSmallestNo(int num, int k) {
        String strNum= ""+num;
        System.out.println(strNum);
        Stack<Integer> stack= new Stack<>();
        String res="";
        for (int i = 0; i < strNum.length(); i++) {
            int dig=Character.getNumericValue(strNum.charAt(i));
            System.out.println("digit: "+dig);

            if(k == 0){
                while(!stack.isEmpty()){
                    res=res + stack.pop();

                }
                return res+ strNum.substring(i-1,strNum.length());
            }
            if(stack.isEmpty() && dig>0){
                stack.push(dig);

            }
            else if(!stack.isEmpty() ){
                while(!stack.isEmpty() && dig < stack.peek() && k >0){
                        k--;
                        stack.pop();
                }

                while(dig==0 && k > 0){
                    stack.pop();
                    k--;
                }
                if(k>0){
                    stack.push(dig);
                }

                }
            }
        return res;
    }

}
