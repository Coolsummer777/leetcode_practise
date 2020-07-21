class Solution {
    public int majorityElement(int[] nums) {
        int key = nums[0];
        int count = 1;
        int index = 1;
        while(index < nums.length){
            if(nums[index] == key){
                count++;
            }else{
                count--;
            }
            index++;
            if(count==0){
                key = nums[index];
                count = 1;
                index++;
            }
        }

        return key;
    }
}