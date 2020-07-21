class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int[][] map = new int[matrix.length][matrix[0].length];
        int[][] edge = new int[matrix.length][matrix[0].length];
        int[][] up = new int[matrix.length][matrix[0].length];
        int[][] left = new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                map[i][j] = matrix[i][j]-'0';

        for(int i=0;i<map.length;i++) left[i][0] = map[i][0];
        for(int i=1;i<map[0].length;i++)
            for(int j=0;j<map.length;j++)
                if(map[j][i]>0) left[j][i] = left[j][i-1]+1;

        for(int i=0;i<map[0].length;i++) up[0][i] = map[0][i];
        for(int i=1;i<map.length;i++)
            for(int j=0;j<map[0].length;j++)
                if(map[i][j]>0) up[i][j] = up[i-1][j]+1;
        
        for(int i=0;i<map.length;i++) edge[i][0] = map[i][0];
        for(int i=0;i<map[0].length;i++) edge[0][i] = map[0][i];


        //=================计算edge===============
        for(int i=1;i<map.length;i++)
            for(int j=1;j<map[0].length;j++){
                if(map[i][j]==1){
                    edge[i][j] = 1;
                    if(up[i][j]>edge[i-1][j-1] && left[i][j]>edge[i-1][j-1])
                        edge[i][j] = edge[i-1][j-1]+1;
                    else
                        edge[i][j] = Math.min(up[i][j],left[i][j]);
                }
            }

        //找max
        for(int i=0;i<map.length;i++)
            for(int j=0;j<map[0].length;j++)
                if(edge[i][j]>max) max=edge[i][j];

        //输出展示
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(map[i][j]+" ");
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(left[i][j]+" ");
            System.out.println();
        }

        return max*max;
    }
}