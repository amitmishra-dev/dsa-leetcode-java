package dsageeks.recursion;

public class fibonaccciSeries {
    public static void main(String[] args) {
        System.out.println(findFib(9));
    }

    private static int findFib(int n) {
        if(n==0 || n==1)
            return n;
        return findFib(n-1)+ findFib(n-2);
    }
}
