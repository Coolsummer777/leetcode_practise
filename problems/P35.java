class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        int p = 0;
        int q = nums.length-1;
        while(p<=q){
            int mid = (p+q)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                if(p<mid){q = mid - 1;}
                else{ return p;}
            }else{
                if(q > mid){p = mid + 1;}
                else {return q+1;}
            }
        }

        return 0;
    }
}