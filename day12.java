class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int maxi = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0;i--){
            if(arr[i]>=maxi){
                maxi = arr[i];
                 ar.add(arr[i]);
            }
           
        }
        Collections.reverse(ar);
        return ar;
    }
}
