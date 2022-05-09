package java8;

public class Rodcutting {
    public static void main(String[] args) {

        int N = 4;
        int[] rodLen = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int[] dp= new int[N];
        System.out.println(func(rodLen,price,N));
    }
    private static int func(int[] rodLen,int[] price,int N){


        int max= 0;
        for (int i = 0; i < rodLen.length; i++) {
            if(rodLen[i]> N)
                continue;

            max= Math.max(max,price[i]+func(rodLen, price, N-rodLen[i]));
        }

        return max;
    }

}














/*
int maxProfit(vector<int>& length, vector<int>& profit, int n) {
    int ans = 0;
    for(int i=0; i<length.size(); i++) {
        if(length[i]>n) {
            continue;
        }
        ans = max(ans, profit[i] + maxProfit(length, profit, n-length[i]);
    }
}





int maxProfit(vector<int>& length, vector<int>& profit, int n) {
    if(n==0) {
        return 0;
    }
    if(dp[n] != -1) {
        return dp[n];
    }

    int ans = 0;
    for(int i=0; i<length.size(); i++) {
        if(length[i]>n) {
            continue;
        }
        ans = max(ans, profit[i] + maxProfit(length, profit, n-length[i]);
    }

    dp[n] = ans;
    return dp[n];
}

 */
