import java.util.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) return 0;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        int[] sum = new int[1];
        sum[0] = triangle.get(0).get(0);
        for(int i=1;i<triangle.size();i++){
            int[] temp = new int[i+1];
            for(int j=0;j<triangle.get(i).size();j++){
                if(j == 0) temp[j] = sum[0] + triangle.get(i).get(j);
                else if( j == i) temp [j] = sum[i-1] + triangle.get(i).get(j);
                else temp[j] = triangle.get(i).get(j) + Math.min(sum[j], sum[j-1]);
            }
            sum = temp;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<sum.length;i++) 
            if(sum[i] < min) min = sum[i];
        return min;
    }
}