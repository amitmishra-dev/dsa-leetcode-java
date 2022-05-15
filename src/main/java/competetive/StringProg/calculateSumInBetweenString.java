package competetive.StringProg;

public class calculateSumInBetweenString {
    public static void main(String[] args) {
        System.out.println(calculateSumOfNumeric("1ab2cdef18"));
    }

    private static int calculateSumOfNumeric(String s) {

        int sum=0;
        StringBuilder temp=new StringBuilder("");
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i)))
                temp= temp.append(s.charAt(i)-'0');
            else{
                if(temp.length()>0)
                    sum+= Integer.parseInt(temp.toString());
                temp.setLength(0);
            }
        }
        if(temp.length()>0)
            sum+= Integer.parseInt(temp.toString());
        return sum;
    }
}
