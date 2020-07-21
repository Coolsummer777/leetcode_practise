public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int[] power = new int[32];
        
        power[0] = 1;
        for(int i=1;i<32;i++) power[i] = 2 * power[i-1];
        int[] nums = new int[32];
        int index = 0;
        while(index<32){
            nums[index] = n & 1;
            n = n >>> 1;
            index++;
        }
        int ans = 0;
        for(int i=0;i<32;i++){
            ans += nums[31-i]*power[i];
        }
        return ans;
    }
}

