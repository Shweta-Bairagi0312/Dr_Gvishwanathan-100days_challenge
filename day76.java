class Solution {
    public int hammingWeight(int n) {
        int hWeight = 0;
        while(n > 0){
            hWeight += (n & 1);
            n >>= 1;
        }
        return hWeight;
    }
}
