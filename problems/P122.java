class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0; 
        int sum = 0;
        int lowwest = prices[0];
        int index = 1;
        while(index<prices.length){
            if(prices[index]<lowwest){
                lowwest = prices[index];
                index++;
            }else if(prices[index] > lowwest){
                if(index==prices.length-1 || prices[index+1]<=prices[index]){
                    sum = sum + prices[index] - lowwest;
                    lowwest = prices[index];
                    index++;
                }else{
                    index++;
                }
            }else{
                index++;
            }
        }
        return sum;
    }
}