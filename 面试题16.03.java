class Solution {
    public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        if(start1[0] > end1[0]){
            int t;
            t = start1[0]; start1[0] = end1[0]; end1[0] = t;
            t = start1[1]; start1[1] = end1[1]; end1[1] = t;
        }else if(start1[0] == end1[0]){
            int t;
            if(end1[1] < start1[1])
                t = start1[1]; start1[1] = end1[1]; end1[1] = t;
        }else{}
        if(start2[0] > end2[0]){
            int t;
            t = start2[0]; start2[0] = end2[0]; end2[0] = t;
            t = start2[1]; start2[1] = end2[1]; end2[1] = t;
        }else if(start2[0] == end2[0]){
            int t;
            if(end2[1] < start2[1])
                t = start2[1]; start2[1] = end2[1]; end2[1] = t;
        }else{}
        double[] crossPoint = new double[2];
        if(start1[0] == end1[0]){//l1垂直
            if(start2[0] == end2[0]){//l2垂直
                if(start1[0] == start2[0]){//共线
                    if(start1[1] > end2[1] || end1[1] < start2[1]){
                        return null;
                    }else if(start1[1] < start2[1]){
                        crossPoint[0] = start2[0];
                        crossPoint[1] = start2[1];
                        return crossPoint;
                    }else{
                        crossPoint[0] = start1[0];
                        crossPoint[1] = start1[1];
                        return crossPoint;
                    }
                }else{//不共线
                    return null;
                }
            }else{//l2不垂直
                if(start2[0] > start1[0] || end2[0] < end1[0]){
                    return null;
                }else{
                    double y = ((end2[1] - start2[1])/((double)(end2[0] - start2[0])))*(start1[0] - start2[0]) + start2[1];
                    if(y > end1[1] || y < start1[1]) {
                        return null;
                    }else{
                        crossPoint[0] = start1[0];
                        crossPoint[1] = y;
                        return crossPoint;
                    }
                }
            }
        } else{//l1不垂直
            if(start2[0] == end2[0]){//l2垂直
                if(start1[0] > start2[0] || end1[0] < end2[0]){
                    return null;
                }else{
                    double y = ((end1[1] - start1[1])/((double)(end1[0] - start1[0])))*(start2[0] - start1[0]) + start1[1];
                    if(y > end2[1] || y < start2[1]) {
                        return null;
                    }else{
                        crossPoint[0] = start2[0];
                        crossPoint[1] = y;
                        return crossPoint;
                    }
                }
            }else{//l2不垂直
                double k1 = (end1[1] - start1[1])/((double)(end1[0] - start1[0]));
                double k2 = (end2[1] - start2[1])/((double)(end2[0] - start2[0]));
                if(Math.abs(k1 -k2) < 0.000001){//平行线

                }else{//不平行
                    
                }
            }

        }
        return crossPoint;
    }
}