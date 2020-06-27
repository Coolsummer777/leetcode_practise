class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        long index = 5;
        while(index <= n){
            count += (n / index);
            index *= 5;
        }
        return count;
    }
}