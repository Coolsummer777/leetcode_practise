class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length>0){
            k = k % nums.length;
            reverse(nums,0,nums.length);
            reverse(nums, 0, k);
            reverse(nums, k, nums.length);
        }
    }

    public void reverse(int[] nums,int head,int tail){
        for(int i=0;i<(tail-head)/2;i++){
            int t = nums[head+i];
            nums[head+i] = nums[tail-i-1];
            nums[tail-i-1] = t;
        }
    }
}