class Solution {
    public void moveZeroes(int[] nums) {
        int head = 0;
        int end = 0;
        while(end < nums.length){
            if(nums[end] != 0 ){
                if(head < end){
                    nums[head] = nums[end];
                    head++;
                }else{
                    head++;
                }
            }

            end++;
        }
        for(int i=head;i<nums.length;i++) nums[i] = 0;
    }
}