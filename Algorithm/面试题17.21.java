class Solution {
    public int trap(int[] height) {
        int maxIndex = 0;
        for(int i=1;i<height.length;i++)
            if(height[i] > height[maxIndex]) maxIndex = i;
        int p = 0;
        int q = 1;
        int sum = 0;
        int total = 0;
        while(q <= maxIndex){
            if(height[q] < height[p]){
                sum += height[q];
                q++;
            } else{
                total += (height[p] * (q -p -1) - sum);
                p = q;
                sum = 0;
                q++;
            }
        }
        p = height.length-1;
        q = p-1;
        sum = 0;
        while(q >= maxIndex){
            if(height[q] < height[p]){
                sum += height[q];
                q--;
            } else{
                total += (height[p] * (p - q -1) - sum);
                p = q;
                sum = 0;
                q--;
            }
        }
        return total;
    }
}