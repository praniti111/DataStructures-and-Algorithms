class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;// Swap the first and last nodes and return from prev i.e. last pointer 
        
        while(curr!=null)
        {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
