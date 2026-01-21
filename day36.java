class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next!=null){
           temp = temp.next;
           len++;
        }

        temp.next = head;
        k = k%len;
        for(int i = 0; i<len-k; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
