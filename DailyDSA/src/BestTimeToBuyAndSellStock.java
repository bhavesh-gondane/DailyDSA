public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
//        int i=0,j=i+1;
//        int res=0;
//        while (i<prices.length-1&&j<prices.length){
//            int buy=prices[i];
//            int sell=prices[j];
//            if(buy<sell){
//                int max=Math.abs(buy-sell);
//                res=Math.max(res,max);
//            }
//            if(j==prices.length-1){
//                i++;
//                j=i+1;
//                continue;
//            }
//            j++;
//        }
//        return res;

        int min=Integer.MAX_VALUE;
        int res=0;
        for(int n : prices){
            if(n<min){
                min=n;
            }
            int profit=Math.abs(n-min);
            res=Math.max(res,profit);
        }
        return res;
    }
}
