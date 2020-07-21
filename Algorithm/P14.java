class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder sBuilder = new StringBuilder();
        int min = strs[0].length();
        for(int i=0;i<strs.length;i++)
            if(strs[i] == null) return "";
            else if(strs[i].length() < min) 
                min = strs[i].length();
        return sBuilder.toString();
    }
}