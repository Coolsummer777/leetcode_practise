import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count = 0;
        int[] nums = new int[n];
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(nums[i] == 0){
                for(int j=2;j<=n/i;j++)
                    if(i*j<n) nums[i*j] = 1;
            }
        }
        for(int i=2;i<n;i++)
            if(nums[i]==0)
                count++;
        return count;
    }
}