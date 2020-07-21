import java.util.HashMap;
import java.util.Objects;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] slist = str.split(" ");
        if(pattern.length()!=slist.length) return false;
        HashMap<String,Integer> sMap = new HashMap<>();
        HashMap<String,Integer> pMap = new HashMap<>(); 
        for(int i=0;i<slist.length;i++){
            String t = "" + pattern.charAt(i);
            if(!sMap.containsKey(slist[i]) && !pMap.containsKey(t)){
                sMap.put(slist[i], i);
                pMap.put(t, i);
            }else if (sMap.containsKey(slist[i]) && pMap.containsKey(t) && Objects.equals(sMap.get(slist[i]),pMap.get(t)) ){
                sMap.put(slist[i], i);
                pMap.put(t, i);
            }else{
                return false;
            }
        }
        return true;
    }
}