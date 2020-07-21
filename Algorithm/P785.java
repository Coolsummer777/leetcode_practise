import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class Solution {
    public boolean isBipartite(int[][] graph) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        set1.add(0);
        list.add(0);
        while(count<graph.length){
            int index = list.pop();
            count++;
            if(set1.contains(index)){
                for(int j=0;j<graph[index].length;j++){
                    if(set1.contains(graph[index][j])){
                        return false;
                    }else{
                        if(!set2.contains(graph[index][j])){
                            set2.add(graph[index][j]);
                            list.add(graph[index][j]);
                        }
                    }
                }
            }else if(set2.contains(index)){
                for(int j=0;j<graph[index].length;j++){
                    if(set2.contains(graph[index][j])){
                        return false;
                    }else{
                        if(!set1.contains(graph[index][j])){
                            set1.add(graph[index][j]);
                            list.add(graph[index][j]);
                        }
                    }
                }
            }

            if(list.size()==0){
                for(int i=0;i<graph.length;i++)
                    if(!set1.contains(i) && !set2.contains(i)){
                        set1.add(i);
                        list.add(i);
                        break;
                    }
            }

        }

        return true;
    }
}