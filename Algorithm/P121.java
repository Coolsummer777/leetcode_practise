class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int max = 0;
        int lowwest = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] - lowwest > max)
                max = prices[i] - lowwest;
            if(prices[i] < lowwest)
                lowwest = prices[i];
        }
        return max;
    }
}