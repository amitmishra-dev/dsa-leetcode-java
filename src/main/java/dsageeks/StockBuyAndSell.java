package dsageeks;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {10,5,7,12,1,18};
        //System.out.println(stockBuyAndsellFunc(arr));
        System.out.println(stockBuyAndsellFuncON(arr));
    }

    private static int stockBuyAndsellFunc(int[] arr) {

        int maxProfit =Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j] > arr[i]){

                    int diff = arr[j]-arr[i];
                    if(diff >maxProfit)
                        maxProfit= diff;
                }
            }
        }
        return maxProfit;
    }

    private static int stockBuyAndsellFuncON(int[] arr) {

        int buy =Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i = 0; i < arr.length; i++) {
            buy= Math.min(buy,arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] -buy);

        }
        return maxProfit;
    }
}
