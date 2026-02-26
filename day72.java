class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(String word: words){
            int mask = 0;
            for(char ch: word.toCharArray()){
                mask |= 1<<ch-'a';
                

            }
            count += map.getOrDefault(mask,0);
            map.merge(mask, 1,Integer:: sum);
        }
        return count;
    }
}
