class Solution{
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while(temp.next!=null){
            length++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        temp = head;
        for(int i=1;i<=length-k-1;i++){
            temp = temp.next;
        } 
        ListNode forward = temp.next;
        temp.next = null;
        return forward;
    }
}