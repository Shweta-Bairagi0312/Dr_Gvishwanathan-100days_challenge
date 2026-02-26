class Solution {
    public String digitSum(String s, int k) {
       while(s.length()>k){
        String newStr = "";
        for(int i =0; i<s.length(); i+=k){
            String substr = s.substring(i,Math.min(i+k,s.length()));
            int sum = 0;
            for(int j = 0; j<substr.length(); j++){
                sum += substr.charAt(j)-'0';
            }
            newStr += ""+sum;
        }
        s = newStr;
       } 

       return s;
    }
}
