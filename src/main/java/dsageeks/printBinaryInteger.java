package dsageeks;

public class printBinaryInteger {
    public static void main(String[] args) {
        int n= 13;
        System.out.println(printBinaryRepresentation(n));
    }

    private static StringBuilder printBinaryRepresentation(int n) {
        StringBuilder res= new StringBuilder();
        int remainder= -1;
        while(n>0){
            remainder= n%2;
            res.append(remainder);
            n= n/2;
        }
        return res.reverse();
    }
}
