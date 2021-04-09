class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i] >= s) return 1;
        long[] sum = new long[nums.length];
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++) sum[i] = nums[i] + sum[i-1];
        for(int i=2;i<=nums.length;i++){
            for(int j=i-1;j<nums.length;j++){
                if(j == i-1){
                    if(sum[j] >= s) 
                        return i;
                }else{
                    if(sum[j] - sum[j - i] >= s)
                        return i;
                }
            }
        }
        return 0;
    }
}“abc空格空格”