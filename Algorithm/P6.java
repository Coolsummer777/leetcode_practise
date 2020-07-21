import java.util.*;

class Solution {
    public String convert(String s, int numRows) { 
        if(s == null || s.length()==0) return s;
        if(numRows <= 1) return s;
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0;i<numRows;i++) list.add(new StringBuilder());
        int index = 0;
        while(index<s.length()){
            for(int i=0;i<numRows;i++){
                if(index>=s.length()) break;
                list.get(i).append(s.charAt(index));
                index++;
            }
            for(int i=numRows-2;i>0;i--){
                if(index>=s.length()) break;
                list.get(i).append(s.charAt(index));
                index++;
            }
        }
        for(int i=0;i<numRows;i++)
            sBuilder.append(list.get(i).toString());
        return sBuilder.toString();

    }
}