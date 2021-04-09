class Solution {
    public int findLength(int[] A, int[] B) {
        if(A.length == 0 || B.length == 0) return 0;
        int max = 0;
        for(int i=0;i<A.length;i++){
            int len = Math.min(A.length-i-1, B.length-1);
            int count = 0;
            for(int j=0;j<=len;j++){
                if(A[i+j] == B[j]) count++;
                else count = 0;
                if(count > max) max = count;
            }
        }
        for(int i=0;i<B.length;i++){
            int len = Math.min(B.length-i-1, A.length-1);
            int count = 0;
            for(int j=0;j<=len;j++){
                if(B[i+j] == A[j]) count++;
                else count = 0;
                if(count > max) max = count;
            }
        }
        return max;
    }
}