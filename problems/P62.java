class Solution {
    public int uniquePaths(int m, int n) {
        n -= 1;
        m -= 1;
        if(n*m == 0) return 1;
        if(n > m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }
        long ans = 1;
        int index = n+m;
        int div = 1;
        while(index>m){
            ans *= index;
            index --;
            while(div<=n && ans % div == 0){
                ans /= div;
                div++;
            }
        }
        return (int)ans;
    }
}