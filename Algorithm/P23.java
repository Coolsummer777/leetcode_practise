import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        if(n==0){
            list.add("");
            return list;
        }
        long num = 1;
        for(int i=0;i<2*n;i++) num *= 2;
        for(long i=1;i<num;i++){
            int sum = 0;
            long t = i;
            int step = 2*n;
            while(step>0){
                step--;
                if(t%2==0){ sum++;}
                else{ sum--;}
                t/=2;
                if(sum<0) break;
            }
            if(sum==0){
                StringBuilder stringBuilder = new StringBuilder();
                t = i;
                step = 2*n;
                while(step>0){
                    step--;
                    if(t%2==0){ stringBuilder.append("(");}
                    else{ stringBuilder.append(")");}
                    t/=2;
                }
                list.add(stringBuilder.toString());
            }
        }
        return list;
    }
}