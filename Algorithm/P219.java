import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1 || k<=0) return false;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }else{
                if(i - hashMap.get(nums[i]) <= k){
                    return true;
                } else{
                    hashMap.put(nums[i], i);
                }
            }
        }
        return false;
    }  
}