class Solution {
    public String decodeString(String s) {
        Stack<Integer>st = new Stack<>();
        Stack<StringBuilder>sb = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        int n = 0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                n = n*10+(ch-'0');
            }
            else if(ch=='['){
                st.push(n);
                n = 0;
                sb.push(sb1);
                sb1 = new StringBuilder();

            }
            else if(ch==']'){
                int k = st.pop();
                StringBuilder temp = sb1;
                sb1 = sb.pop();
                while(k>0){
                    sb1.append(temp);
                    k--;
                }

            }
            else{
                sb1.append(ch);
            }
        }
        return sb1.toString();

    }
}
