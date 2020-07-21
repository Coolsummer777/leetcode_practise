class Solution {
    public int minPathSum(int[][] grid) {
        int[][] sum = new int[grid.length][grid[0].length];
        sum[0][0] = grid[0][0];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                sum[i][j] = grid[i][j];
                if(i>0 && j==0) sum[i][j] += sum[i-1][j];
                else if(j>0 && i==0) sum[i][j] += sum[i][j-1];
                else if(i*j>0)sum[i][j] +=Math.min(sum[i][j-1], sum[i-1][j]);
                else{};
            }   
                
        return sum[grid.length-1][grid[0].length-1];
    }
}