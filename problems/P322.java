import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        if(amount <0) return -1;
        if(coins == null || coins.length == 0) return -1;
        Arrays.sort(coins);
        int[] ans = new int[amount+1];
        int index = coins.length;
        for(int i=0;i<coins.length;i++)
            if(coins[i]<amount){
                ans[coins[i]] = 1;
            }else if(coins[i] == amount){
                return 1;
            }
            else{
                index = i;
                break;
            }
        for(int i=1;i<=amount;i++){
            int min = -1;
            for(int j=0;j<index;j++){
                if(i-coins[j]>0 && ans[i-coins[j]]>0 && ans[i] == 0){
                    if(min<0 || ans[i-coins[j]]<min)
                        min = ans[i-coins[j]];
                }
            }
            if(min>0) ans[i] = min+1;
        }
        return ans[amount]>0?ans[amount]:-1;
    }
}