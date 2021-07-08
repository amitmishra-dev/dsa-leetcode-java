package competetive.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllCombinationTwoStrings {
    public static List<String> res= new ArrayList<>();


    public static void main(String[] args) {
        String a = "ab";
        String b = "xy";
        Map<Integer,String> hmPhone= new  HashMap<>();
        hmPhone.put(1,a);
        hmPhone.put(2,b);
        StringBuilder path= new StringBuilder();

        String input="12";
        printAllCombinationsString(0, path, input,hmPhone);
        res.stream().forEach(System.out::println);
    }

    private static void printAllCombinationsString(int index, StringBuilder path, String input, Map<Integer, String> hm) {

        if(path.length()>=2){
            res.add(path.toString());
            return;
        }
        // get index
        //loop doe all character
        //append path of first string
        String s= hm.get(input.charAt(index));
        for (char c : s.toCharArray()){
            path.append(c);
            printAllCombinationsString(index+1, path,input, hm);
            path.deleteCharAt(path.length()-1);
        }
    }
}
