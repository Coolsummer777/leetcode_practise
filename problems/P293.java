import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                StringBuilder sBuilder = new StringBuilder();
                if(i>0) sBuilder.append(s.substring(0, i));
                if(s.charAt(i) == '+'){
                    sBuilder.append("--");
                }else{
                    sBuilder.append("++");
                }
                if(i<s.length()-1) sBuilder.append(s.substring(i+2));
                list.add(sBuilder.toString());
            }
        }
        return list;
    }
}