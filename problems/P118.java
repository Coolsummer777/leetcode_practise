import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0) return list;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> last = list.get(list.size()-1);
            int size = last.size();
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0;j<size-1;j++){
                temp.add(last.get(j)+last.get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}