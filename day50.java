class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int height[] = new int[matrix[0].length];
        for(int i = 0; i<matrix[0].length;i++){
            if(matrix[0][i] == '1'){
                height[i] = 1;
            }
        }
        int res = largest(height);
        for(int i = 1; i<matrix.length;i++){
            reset(matrix, height,i);
                res = Math.max(res,largest(height));
            }
            return res;

        }


        private void reset(char[][]matrix, int []height,int idx){
            for(int i = 0; i<matrix[0].length; i++){
                if(matrix[idx][i]=='1'){
                    height[i] += 1;
                }
                else{
                    height[i]  = 0;
                }
            }

        }
        public int largest(int []height){
            if(height == null || height.length == 0){
                return 0;
            }
            int len = height.length;
            Stack<Integer> st = new Stack<Integer>();
            int maxarea = 0;
            for(int i = 0; i<=len; i++){
                int h = (i == len ? 0:height[i]);
                if(st.isEmpty()|| h>= height[st.peek()]){
                    st.push(i);
                }else{
                    int tp = st.pop();
                    maxarea = Math.max(maxarea, height[tp]*(st.isEmpty() ? i:i - 1 - st.peek()));
                    i--;
                }
            }
            return maxarea;
            
        }
       

    }
