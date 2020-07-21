import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[][] d = {{2,1},{3,1},{4,1},{1,5}};  
        System.out.println(minNumberOfSemesters(n,d,k));
    }

    public static int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        int step = 0;
        int left = n;
        int[] need = new int[n+1];
        int[] done = new int[n+1];
        int count = 0;
        int countDown = 10;
        
        for(int i=0;i<dependencies.length;i++)
            need[dependencies[i][1]]++;
        
        
            // for(int i=1;i<=n;i++) System.out.print(need[i]+" ");System.out.println();
            // for(int i=1;i<=n;i++) System.out.print(done[i]+" ");System.out.println();
        
        while(left>0){
            step++;
            int ava = 0;
            
            for(int i=1;i<=n;i++){
                if(need[i] == 0 && done[i] == 0){
                    ava++;
                    done[i] = 2;
                }
            }
            
            if(countDown>0){
                countDown--;
                System.out.println(ava);
                for(int i=1;i<=n;i++) System.out.print(need[i]+" ");System.out.println();
                for(int i=1;i<=n;i++) System.out.print(done[i]+" ");System.out.println();
                System.out.println(left);
                System.out.println();
            }


            if(ava <= k){
                
                left -= ava;
                for(int i=1;i<=n;i++){
                    if(done[i] == 2){
                        for(int j=0;j<dependencies.length;j++){
                            if(dependencies[j][0] == i){
                                need[dependencies[j][1]]--;
                            }
                        }
                        done[i] = 1;
                    }
                }
                
            }else{
                left -= k;
                
                for(int t=0;t<k;t++){
                    int max = -1;
                    int maxIndex = 0;
                    for(int i=1;i<=n;i++){
                        if(done[i] == 2){
                            count = 0;
                            for(int j=0;j<dependencies.length;j++){
                                if(dependencies[j][0] == i && need[dependencies[j][1]] == 1){
                                    count++;
                                }
                            }
                            if(count > max){
                                max = count;
                                maxIndex = i;
                            }
                        }
                    }
                    done[maxIndex] = 1;
                    for(int j=0;j<dependencies.length;j++){
                        if(dependencies[j][0] == maxIndex)
                            need[dependencies[j][1]]--;
                    }
                }

                for(int i=1;i<=n;i++)
                    if(done[i] == 2) done[i] = 0;                
            }
        }
        return step;
    }
}