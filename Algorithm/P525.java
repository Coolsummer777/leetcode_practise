import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0) 
                nums[i]--;
        for(int i=1;i<nums.length;i++)
            nums[i] += nums[i-1];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])>max)
                    max = i- map.get(nums[i]);
            }else{
                map.put(nums[i], i);
            }
        }
        return max;
    }
}