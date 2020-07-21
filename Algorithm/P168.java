class Solution {
    public String convertToTitle(int n) {
        if(n<1) return null;
        StringBuilder sBuilder = new StringBuilder();
        int t = 0;
        while(n>0){
            t = n % 27;
        }
        return reverse(sBuilder.toString());
    }
    public String reverse(String s){
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++)
            sBuilder.append(s.charAt(s.length()-i-1));
        return sBuilder.toString();
    }
}