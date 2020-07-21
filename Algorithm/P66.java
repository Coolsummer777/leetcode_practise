class Solution {
    public int[] plusOne(int[] digits) {
        int[] nums = new int[digits.length+1];
        int temp = 1;
        for(int i=digits.length-1;i>=0;i--){
            temp += digits[i];
            nums[i+1] = temp % 10;
            temp /= 10;
        }
        if(temp>0){
            nums[0] = temp;
            return nums;
        }
        else{
            for(int i=0;i<digits.length;i++)
                digits[i] = nums[i+1];
            return digits;
        }

    }
}