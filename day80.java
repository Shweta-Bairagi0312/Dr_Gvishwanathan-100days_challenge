class Solution {
    public List<String> commonChars(String[] words) {
        int [] last =  count(words[0]);


        for(int i = 1; i<words.length; i++){
            last = intersection(last,count(words[i]));
        }

        List<String> res = new ArrayList<>();
        for(int i = 0; i<26; i++){
            if(last[i]!=0){
                char ch = (char)('a'+i);
                String c = String.valueOf(ch);
                while(last[i]>0){
                    res.add(c);
                    last[i]--;
                }

            }
        }
     return res;
 
    
    }
    public int[] intersection(int[] a, int [] b){
        int []t = new int[26];
        for(int i = 0; i<26; i++){
            t[i] =  Math.min(a[i],b[i]);
        }
        return t;
    }
    public int[] count(String s){
        int []t = new int[26];
        char [] ch = s.toCharArray();
        for(char c: ch){
            t[c-'a']++;
        }
        return t;
    }
}
