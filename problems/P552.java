class Solution {
    private final int M =(int)Math.pow(10,9)+7;
    public int checkRecord(int n) {
        if (n == 0) return 1;
        if (n == 1) return 3;
        if (n == 2) return 8;
        if (n == 3) return 19;
        long[] a = {1,2,4};
        long[] l = {1,3,7};
        long[] p = {1,3,8};
        long[] f = {1,4,7};
        long[] fp = {1,2,4};
        long[] ll = {0,1,2};
        long _a = 0;
        long _l =0;
        long _p =0;
        long _f =0;
        long _fp =0;
        long _ll = 0;
        long _t = a[2]+l[2]+p[2];
        for(int i=4;i<=n;i++){
            _a = (f[2])%M;
            _l = (_t -ll[2]+M)%M;
            _p = (_t)%M;
            _f = (f[2] + fp[1] + f[1])%M;
            _fp = (f[2])%M;
            _ll = (a[1] + p[1])%M;
            a[1] = a[2];a[2] = _a;
            l[1] = l[2];l[2] = _l;
            p[1] = p[2];p[2] = _p;
            ll[1] = ll[2];ll[2] = _ll;
            f[1] = f[2];f[2] = _f;
            fp[1] = fp[2];fp[2] = _fp;
            _t=(a[2]%M + l[2]%M + p[2]%M )%M;
        }

        return (int)(_t);
    }
}