class Solution {
    public int maxPower(String s) {
        if(s.length() == 0) return 0;
        int max = 0;
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            } else{
                count = 1;
            }
            if(count > max) max = count;
        }
        return max;
    }
}