package competetive.StringProg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class PermutationString {

        static HashSet<String> set = new HashSet<String>();
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter :");
            StringBuilder  str = new StringBuilder(in.nextLine());
            NONDuplicatePermutation("",str.toString());  //WITHOUT DUPLICATE PERMUTATION OF STRING
            System.out.println(set);
        }


        public static void NONDuplicatePermutation(String prefix,String str){
            //It is nlogn
            if(str.length()==0){
                set.add(prefix);
            }else{
                for(int i=0;i<str.length();i++){
                    System.out.println("=============> prefix: "+ prefix);
                    System.out.println("prefix + char : "+prefix+ str.charAt(i));
                    System.out.println("0..i :"+str.substring(0,i));
                    System.out.println("i+1 :"+str.substring(i+1));

                    NONDuplicatePermutation(prefix+ str.charAt(i), str.substring(0,i)+str.substring(i+1));
                }
            }

        }

    }
