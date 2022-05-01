package competetive.StringProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllSubstring {
    public static void main(String[] args) {
        printSubString("abc",0,"");

    }

    private static void printSubString(String str, int i, String cur) {

        //print all substring
        if(i==str.length()){
            System.out.println(cur);
            return;
        }
        printSubString(str, i+1,cur +str.charAt(i));
        printSubString(str, i+1,cur );


    }
}
