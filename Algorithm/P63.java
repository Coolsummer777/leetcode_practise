class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] steps = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0] == 1) return 0;
        steps[0][0] = 1;
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 0){
                    if(i>0) steps[i][j] += steps[i-1][j];
                    if(j>0) steps[i][j] += steps[i][j-1];
                }
            }
        }
        return steps[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}