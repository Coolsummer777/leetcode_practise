class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]+numbers[i+1]>target) break;
            int t = binarySearch(numbers,target-numbers[i],i);
            if(t > i) {
                ans[0] = i+1;
                ans[1] = t+1;
                return ans;
            }
        }
        return null;
    }

    // public int binarySearch(int[] nums,int target,int head){
    //     int p = head+1;
    //     int q = nums.length-1;
    //     while(p<=q){
    //         int mid = (p+q)/2;
    //         if(nums[mid] == target) return mid;
    //         else if(nums[mid] < target){
    //             p = mid + 1;
    //         }else{
    //             q = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    public int binarySearch(int[] nums,int target,int head){
        int p = head+1;
        int q = nums.length-1;
        int index = -1;
        double t = target + 0.5;
        while(p<=q){
            if(t > nums[q]) { index = q; break;}
            if(t < nums[p]) { index = -1;break;}
            int mid = (p+q) / 2;
            if(nums[mid] > t){
                if(p < mid){ q = mid - 1; }
                else { index = q - 1;break;}
            }else{
                if(q > mid){ p = mid + 1;}
                else{ index = q + 1;break;}
            }
        }

        if(index > head && index < nums.length && nums[index] == target) return index;
        return -1;
    }
}