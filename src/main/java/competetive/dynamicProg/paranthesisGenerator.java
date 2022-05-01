package competetive.dynamicProg;

import java.util.ArrayList;

public class paranthesisGenerator {

    public static void main(String[] args) {
        generateParenthesis(4).stream().forEach(System.out::println);
    }
        public static ArrayList<String> generateParenthesis(int A) {
            ArrayList<String> res = new ArrayList<>();
            findAllPermutation("(",1,0,A,res);
            return res;
        }

        private static void findAllPermutation(String cur,int oc,int cc,int n,ArrayList<String> res){

            if(oc==cc && cc==n){
                res.add(cur);
            }

            if(oc < n) findAllPermutation(cur+"(",oc+1,cc,n,res);
            if(cc < oc) findAllPermutation(cur+")",oc,cc+1,n,res);

        }
    }

