class Solution {
    public int numWays(int n, int k) {
        if(n == 0) return 1;
        if(n == 1) return k;
        int[] pre = new int[k];
        int[] prePre = new int[k];
        int sumPre = 0;
        int sumPrePre = 0;
        for(int i=0;i<k;i++){
            prePre[i] = 1;
            pre[i] = k;
        }
        sumPrePre = k;
        sumPre = k*k;
        for(int i=2;i<n;i++){
            int[] cur = new int[k];
            int sum = 0;
            for(int j=0;j<k;j++){
                cur[j] = sumPre - pre[j] + sumPrePre - prePre[j];
                sum += cur[j];
            }
            prePre = pre;
            pre = cur;
            sumPrePre = sumPre;
            sumPre = sum;
        }
        return sumPre;
    }
}