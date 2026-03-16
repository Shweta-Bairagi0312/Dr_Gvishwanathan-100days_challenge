class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            int zerocount = 0;
            int onecount = 0;
            for(int j = i; j<s.length(); j++){
                if(s.charAt(j)=='0'){
                    zerocount++;
                }
                else{
                    onecount++;
                }
                if(zerocount<=k ||onecount<=k){
                    count++;
                }
            }
            
        }
        return count;
    }
}
