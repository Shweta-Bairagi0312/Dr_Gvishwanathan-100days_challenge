class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: order.toCharArray()){
            if(map.containsKey(ch)){
                sb.append(String.valueOf(ch).repeat(Math.max(0,map.get(ch))));

                map.remove(ch);
            }
        }
        for(char ch: map.keySet()){
             sb.append(String.valueOf(ch).repeat(Math.max(0,map.get(ch))));
        }

        return sb.toString();
    }
}
