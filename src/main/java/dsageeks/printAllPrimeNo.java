package dsageeks;

public class printAllPrimeNo {

    public static void main(String[] args) {
        findAllPrimeNo(20);
    }

    private static void findAllPrimeNo(int N) {
        boolean[] isPrime = new boolean[N+1];
        for (int i = 1; i <=N ; i++) {
            isPrime[i]=true;
        }

        isPrime[0]= false;
        isPrime[1]= false;

        for (int i = 2; i <=N ; i++) {
                if(isPrime[i]) {
                    for (int j = 2*i; j <=N ; j= j+i) {
                        isPrime[j]=false;
                    }
                }
        }

        for (int i = 1; i <=N ; i++) {
            if(isPrime[i]) {
                System.out.println(i);
            }
        }
       // System.out.println(Long.MAX_VALUE);//max 19 length for 64 bit machine
    }
}
