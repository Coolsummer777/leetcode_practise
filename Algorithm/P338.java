class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        if(num == 0) return ans;
        ans[0] = 0; 
        ans[1] = 1;
        if(num == 1) return ans;
        int len = 1;
        int[] pow = new int[32];
        pow[0] = 1;
        for(int i=1;i<32;i++) pow[i] = 2*pow[i-1];

        for(int i=2;i<=num;i++){
            if(ans[i-1] == len){
                len++;
                ans[i] = 1;
            } else{
                ans[i] = 1 + ans[i-pow[len-1]];
            }
        }
        return ans;
    }
}