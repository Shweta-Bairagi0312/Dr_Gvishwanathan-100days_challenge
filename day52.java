class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<Character>();
        if(k==n){
            return "0";
        }
        for(int i = 0; i<n;i++){
            char ch = num.charAt(i);
            while(k>0 && !st.isEmpty()&&st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
         sb.append(st.pop());
         sb.reverse();
       }

        if(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }
}
