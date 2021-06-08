package competetive;

public class RepeastingSubSequence {

    public static int anytwo(String A) {
        String subSeq=RSS(A,0,2, "");
        System.out.println("sub sq: "+ subSeq);
        if(subSeq.length()>=2)
            return subSeq.length();
        else
            return 0;
    }

    private static String RSS(String a, int i, int j, String fs) {

        if(i>=a.length() || j>=a.length())
            return "";

        if(a.charAt(i)==a.charAt(j)  ){
            fs=fs.concat(String.valueOf(a.charAt(i)));
            System.out.println("sub seq: "+fs.length());
            fs=fs+RSS(a,i+1,j+1,fs);
            System.out.println("sub seq 2: "+fs.length());

            if(fs.length()>=2)
                return fs;
        }
        else {
            fs = RSS(a, i + 1, j + 1, "");
        }
        return fs;
    }

    public static void main(String[] args) {
        System.out.println(anytwo("abab"));
    }
}