public class Solution {
    public int maxProfit(int[] prices) {
        int profit    = 0;
        int buyPoint  = 0;
        Boolean isBuy = true;
        
        if (prices.length == 0 || prices.length == 1)
        {
            return 0;
        }
        
        for(int i=0; i<prices.length; i++)
        {
            if(isBuy)
            {
                if (i==0)
                {
                    if (prices[i] < prices[i+1])
                    {
                        buyPoint = prices[i];
                        isBuy = false;
                    }
                    
                    continue;
                }
                
                if (i==prices.length -1)
                {
                    continue;
                }
                
                if (prices[i] <= prices[i-1] && prices[i] < prices[i+1])
                {
                    buyPoint = prices[i];
                    isBuy = false;
                    continue;
                }
            }
            
            if (!isBuy)
            {
                if (i==0)
                {
                    continue;
                }
                
                if (i == prices.length -1)
                {
                    if (prices[i] >= prices[i-1])
                    {
                        profit += (prices[i] - buyPoint);
                        isBuy = true;
                    }
                    
                    continue;
                }
                
                if (prices[i] >= prices[i-1] && prices[i] > prices[i+1])
                {
                    profit += (prices[i] - buyPoint);
                    isBuy = true;
                    continue;
                }
            }
        }
        
        return profit;
    }
}
