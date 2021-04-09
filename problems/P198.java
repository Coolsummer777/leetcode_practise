class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] count = new int[nums.length];
        count[0] = nums[0];
        count[1] = nums[1];
        if(count[0] > count[1]) count[1] = count[0];
        for(int i=2;i<nums.length;i++){
            if(nums[i] + count[i-2] >= count[i-1]){
                count[i] = nums[i] + count[i-2];
            } else{
                count[i] = count[i-1];
            }
        }
        return count[nums.length-1];
    }
}