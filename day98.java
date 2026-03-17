class Solution {
    public String makeGood(String s) {
        int n = s.length();
        String ans = "";
        Stack<Character>st = new Stack<>();
        st.push(s.charAt(0));
        char[] arr = s.toCharArray();
        for(int  i = 1; i<n; i++){
            if(!st.isEmpty()&& (st.peek()-arr[i] == 32 ||st.peek()-arr[i] == -32)){
                st.pop();

            }
            else{
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans;

    }
}
