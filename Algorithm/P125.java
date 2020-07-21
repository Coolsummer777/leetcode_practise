class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length()<2) return true; 
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
                stringBuilder.append(c);
        }
        s = stringBuilder.toString();
        s = s.toLowerCase();
        System.out.println(s);
        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        return true;
    }
}