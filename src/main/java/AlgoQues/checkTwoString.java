package AlgoQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class checkTwoString {
    public static void main(String[] args) {
        List<List<String>>  box_template_list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("cm");
        stringList.add("mc");

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("pcm");
        stringList1.add("mc");
        box_template_list.add(stringList);
        box_template_list.add(stringList1);

       int x=  count_invalid_boxes(box_template_list);
        System.out.println("==========>" + x);


    }

    public static int count_invalid_boxes(List<List<String>> box_template_list) {

        boolean isValid=true;
        int count=0;
        if(box_template_list.size() < 10){
            for (int i = 0; i < box_template_list.size(); i++) {
                 List<String> strList= box_template_list.get(i);
                 if(strList.size()>0){
                     isValid = isAnagram(strList.get(0), strList.get(1));
                 }
                 if(isValid==false)
                     count++;

            }

        }
        return count;
    }

    private static boolean isAnagram(String s, String s1) {
        char[] charArr1= s.toCharArray();
        char[] charArr2= s1.toCharArray();
        int n1 = charArr1.length;
        int n2 = charArr2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < n1; i++) {
            System.out.println(charArr1[i]+ " :: " + charArr2[i]);
            if (charArr1[i] != charArr2[i])
                return false;
        }
        return true;
    }
}
