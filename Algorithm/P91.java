class Solution {
    public int numDecodings(String s) {
        if(s == null) return 0;
        int pre = 0;
        int prePre = 0;
        int t = 0;
        t = (int)(s.charAt(0)-'0');
        if(t == 0) return 0;
        pre = 1;
        prePre = 1;

        for(int i=1;i<s.length();i++){

            int cur = 0;

            t = (int)(s.charAt(i)-'0');
            if(t > 0) cur = pre;

            t += (int)(s.charAt(i-1)-'0')*10;
            if(t >=10 && t < 27) cur += prePre;
            prePre = pre;
            pre = cur;
        }

        return pre;
    }
}