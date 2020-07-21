/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) return 1;
        if(!isBadVersion(n)) return n;
        return search(n);
    }

    public int search(int n){
        long p = 1;
        long q = n;
        int count = 0;
        while(p<=q){
            count++;
            long mid = (p+q)/2;
            if(isBadVersion((int)mid)){
                if(!isBadVersion((int)mid-1)) {
                    return (int)mid;
                }
                else q = mid-1;
            }else{
                if(isBadVersion((int)mid+1)){return (int)mid+1;} 
                else p = (int)mid+1;
            }
        }
        System.out.println(count);
        return 1;
    }
}