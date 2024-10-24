/*class Solution {
    public int maxProfit(int[] prices) {
        int left[]=new int [prices.length];
        int right[]=new int [prices.length];
        left[1]=prices[0];
        right[prices.length-1]=prices[prices.length-1];
        for(int i=1;i<prices.length;i++){
            left[i]=Math.min(left[i-1],prices[i]);
        }
         for(int i = prices.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],prices[i]);
        }
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            max_profit=Math.max(max_profit,right[i]-left[i]);
        }
        return max_profit;
    }
}*/
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice)
            minprice=prices[i];
            maxprofit=Math.max(prices[i]-minprice,maxprofit);
        }
        return maxprofit;
    }
}
        