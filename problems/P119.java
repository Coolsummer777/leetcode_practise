import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> last = new ArrayList<>();
        last.add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0;j<last.size()-1;j++)
                temp.add(last.get(j)+last.get(j+1));
            temp.add(1);
            last = temp;
        }
        return last;
    }
}