import java.util.*;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains((int) s.charAt(i))){
                set.remove((int)s.charAt(i));
            } else{
                set.add((int)s.charAt(i));
            }
        }
        if(set.size()>1) return false;
        else return true;
    }
}