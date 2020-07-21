class Solution {
    public int numSquares(int n) {
        int[] ans = new int[n+1];
        int k = intSqrt(n);
        for(int i=1;i<=n;i++){
            int t = intSqrt(i);
            if(t*t == i) ans[i] = 1;
            else{
                int min = Integer.MAX_VALUE;
                for(int j=1;j<=t;j++){
                    if(ans[i-j*j]<min) min = ans[i-j*j];
                }
                ans[i] = min + 1;
            }
        }

        return ans[n];
    }

    public int intSqrt(int n){
        return (int)Math.sqrt(n);
    }
}