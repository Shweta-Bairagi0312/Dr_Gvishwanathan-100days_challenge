class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = -1;
        for(String str:words){
            if(str.matches("\\d+")){
                int num = Integer.parseInt(str);
                if(num<=prev){
                    return false;
                }
                prev = num;
            }
        }

        return true;
        
    }
}
