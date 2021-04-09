class Solution {
    public int myAtoi(String str) {
        int index = -1;
        int signal = 1;
        long num = 0;
        int ans = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!=' '){ index = i; break; }
        if(index<0) return 0;
        if(str.charAt(index)=='-'){signal = -1;index++;}
        else if(str.charAt(index)=='+'){index++;}
        for(int i=index;i<str.length();i++){
            if(str.charAt(i)>'9'||str.charAt(i)<'0') return ans;
            num = num*10+str.charAt(i)-'0';
            if(signal == 1 && num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(signal == -1 && num>Integer.MAX_VALUE) return Integer.MIN_VALUE;
            ans = signal * (int)num;
        }
        return ans; 
    }
}