import java.util.HashMap;
import java.util.Objects;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Integer,Integer> sMap = new HashMap<>();
        HashMap<Integer,Integer> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer ss = (int)s.charAt(i);
            Integer tt = (int)t.charAt(i);
            if(!sMap.containsKey(ss) && !tMap.containsKey(tt)){
                sMap.put(ss, i);
                tMap.put(tt, i);
            }else if(sMap.containsKey(ss) && tMap.containsKey(tt) && Objects.equals(sMap.get(ss),tMap.get(tt)) ){
                sMap.put(ss, i);
                tMap.put(tt, i);
            }else{
                return false;
            }
        }
        return true;
    }
}