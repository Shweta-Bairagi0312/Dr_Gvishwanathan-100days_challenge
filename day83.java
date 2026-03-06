class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String s = "";
        Set<String>set = new HashSet<>();
        for(String curr:words){
            if(curr.length()==1||set.contains(curr.substring(0,curr.length()-1))){
                set.add(curr);

                if(curr.length()>s.length()) s = curr;
            }
        }
        return s;
    }
}
