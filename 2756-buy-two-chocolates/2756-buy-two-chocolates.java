class Solution {
    public int buyChoco(int[] prices, int money) {
       
        int minCost = Integer.MAX_VALUE;

      
        int n = prices.length;

        
        for (int firstChoco = 0; firstChoco < n; firstChoco++) {
            for (int secondChoco = firstChoco + 1; secondChoco < n; secondChoco++) {
          
                int cost = prices[firstChoco] + prices[secondChoco];

                if (cost < minCost) {
                   
                    minCost = cost;
                }
            }
        }

        
        if (minCost <= money) {
       
            return money - minCost;
        } else {
            
            return money;
        }
    }
}