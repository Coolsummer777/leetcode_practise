class Solution {
    public boolean isStrobogrammatic(String num) {
        if(num == null || num.length() == 0) return true;
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            if(c != '1' && c != '6' && c != '8' && c != '9' && c != '0')
                return false;
        }
        for(int i=0;i<=num.length()/2;i++){
            char c = num.charAt(i);
            char cc = num.charAt(num.length()-i-1);
            if(c == '1' && cc != '1') return false;
            if(c == '6' && cc != '9') return false;
            if(c == '8' && cc != '8') return false;
            if(c == '9' && cc != '6') return false;
            if(c == '0' && cc != '0') return false;
        }
        return true;
    }
}