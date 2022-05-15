package AlgoQues;

public class printArray {
    public static void main(String[] args) {
        String s= "ace";
        int n =3;
        convertString(s,n);
    }

    private static void convertString(String s, int n) {
        StringBuilder sb = new StringBuilder("");///
        if(n>26)
            n= n%26;
        int ch=0;
        char res;
        for (int i = 0; i <s.length() ; i++) { // O(n)

             ch= (int)s.charAt(i);
             res= (char) (ch +n);
            sb.append(res);
        }
        System.out.println(sb.toString());
    }
}
