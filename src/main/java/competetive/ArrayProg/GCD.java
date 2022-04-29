package competetive.ArrayProg;

public class GCD {
    public static void main(String[] args) {
        System.out.println(printGCDRec(36,24));
    }

    private static int printGCD(int m, int n) {
        int remainder=-1;

        if(m>n){
            while(remainder!=0){
                remainder=m%n;
                m=n;
                n=remainder;
            }
            return m;
        }
        else
            return -1;

    }
    private static int printGCDRec(int m, int n) {
        if(n==0)
            return m;
        else {
            m = n;
            n = m;
            printGCDRec(m % n, n);
        }
        return -1;
    }
}
