class Solution {
    public int minCost(int[][] costs) {
        if(costs.length == 0) return 0;
        int r = costs[0][0];
        int g = costs[0][1];
        int b = costs[0][2];
        for(int i=1;i<costs.length;i++){
            int rr = costs[i][0] + Math.min(g, b);
            int gg = costs[i][1] + Math.min(r, b);
            int bb = costs[i][2] + Math.min(g, r);
            r = rr;
            g = gg;
            b = bb;
        }
        return Math.min(Math.min(r, g),b);
    }
}