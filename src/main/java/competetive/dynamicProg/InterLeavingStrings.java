package competetive.dynamicProg;

public class InterLeavingStrings {
    //     https://leetcode.com/problems/interleaving-string/

    public static void main(String[] args) {
        String s1="aa";
        String s2="bb";
        String s3="abab";

        boolean res= interleaveStringCheck(s1,s2,s3,s1.length()-1,s2.length()-1,s3.length()-1,0,0,0);
        System.out.println("result:: "+res);
    }

    private static boolean interleaveStringCheck(String s1, String s2, String s3, int length1, int length2, int length3, int i1, int i2, int i3) {

            if(i3==length3){
                return (i1==length1 && i2==length2)?true:false;
            }

            if(i2==length2){
                return s1.charAt(i1)==s3.charAt(i3)?interleaveStringCheck(s1, s2, s3, length1, length2, length3, i1+1, i2, i3+1):false;
            }
            if(i1==length2){
                return s2.charAt(i2)==s3.charAt(i3)?interleaveStringCheck(s1, s2, s3, length1, length2, length3, i1, i2+1, i3+1):false;
            }
            boolean one=false;
            boolean two=false;
            if(s1.charAt(i1)==s3.charAt(i3)&& i1!=length1)
                one= interleaveStringCheck(s1, s2, s3, length1, length2, length3, i1+1, i2, i3+1) ;

            if(s2.charAt(i2)==s3.charAt(i3))
                two= interleaveStringCheck(s1, s2, s3, length1, length2, length3, i1, i2+1, i3+1);
            return one || two;

    }


}
