package competetive.StackProgram;

import java.util.Stack;

public class checkParenthesisWitStar {
    public static void main(String[] args) {
        boolean isValid=checkValidString("**)))");
        System.out.println(isValid);
    }
        public static boolean checkValidString(String s) {
            Stack<Integer> open= new Stack<>();
            Stack<Integer> star= new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if(open.isEmpty() && star.isEmpty() && s.charAt(i)==')')
                    return false;
                if(s.charAt(i)=='*')
                    star.push(i);
                else if (s.charAt(i)=='(')
                    open.push(i);
                else{
                    if(!open.isEmpty())
                        open.pop();
                    else if(!star.isEmpty())
                        star.pop();
                }
            }
            while (!open.isEmpty()){
                if(star.isEmpty()){
                    return false;
                }
                else{
                    if(open.peek() < star.peek()){
                        star.pop();
                    }
                    else
                        return false;
                }
            }
            return true;

        }
}
