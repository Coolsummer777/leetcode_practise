class Solution {
    public int lengthOfLastWord(String s) {
        String[] sList = s.split(" ");
        if(sList.length == 0) return 0;
        else return sList[sList.length-1].length();
    }
}