import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int index = 0;
        Set<String> set = new HashSet<>();
        int len = (nums.length -1) * nums.length / 2;
        int[][] sum = new int[len][3];
        List<List<Integer>> list = new ArrayList<>();
        index = 0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++){
                sum[index][0] = i;
                sum[index][1] = j;
                sum[index][2] = nums[i] + nums[j]; 
                index++;
            }

        // for(int i=0;i<len;i++) System.out.println(i+":  "+nums[sum[i][0]]+" "+nums[sum[i][1]]+" "+sum[i][2]);

        for(int i=0;i<len;i++){
            for(int j=sum[i][1]+1;j<nums.length;j++){
                if(nums[j] + sum[i][2] == 0){
                    // System.out.println(nums[j]+"  "+sum[i][2]);
                    int[] temp = new int[3];
                    StringBuilder sBuilder = new StringBuilder();
                    temp[0] = nums[sum[i][0]];
                    temp[1] = nums[sum[i][1]];
                    temp[2] = nums[j];
                    Arrays.sort(temp);
                    String s = sBuilder.toString();
                    sBuilder.append(String.valueOf(temp[0]));
                    sBuilder.append(String.valueOf(temp[1]));
                    sBuilder.append(String.valueOf(temp[2]));
                    s = sBuilder.toString();
                    if(!set.contains(s)){
                        set.add(s);
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[sum[i][0]]);
                        l.add(nums[sum[i][1]]);
                        l.add(nums[j]);
                        list.add(l);
                    }
                    
                }
            }
        }
        return list;
    }
}