//9. Unfold of a LinkedList
//Given a singly linkedlist : l0 -> ln -> l1 -> ln-1 -> l2 -> ln-2 -> l3 -> ln-3 -> ..... 
//reorder it :  l0 -> l1 -> l2 -> l3 -> l4 -> l5 -> l6 ..... -> ln-1 -> ln

//Input Format
// 1->7->2->6->3->5->4->null
// Output Format
// 1->2->3->4->5->6->7->null

class Solution
{
  public static ListNode reverse(ListNode head)//Code to reverse the ll
  {
    ListNode prev = null, curr = head;
    while(curr!=null)
    {
      ListNode ahead = curr.next;
      curr.next = prev;
      prev = curr;
      curr = ahead;
    }
    return prev;
  }
  
  public static void unfold(ListNode head)// To unfold the ll make two stating pointer nodes initializing with -1
  {
    ListNode firstHead = new ListNode(-1);// FirstNode for the first block of numbers
    ListNode secondHead = new ListNode(-1);// SecondNode for the second block of numbers
    ListNode first = firstHead, second = secondHead;// put the tail pointers first and second on these nodes
    
    while(head!=null)// run the loop till head is null
    {
      first.next = head; // First block of code where the fisrt's add will be head's
      first = head;
      head = head.next;
      
      if(head!=null)//Check if the head is not null yet
      {
        second.next = head; // Second block of code where the second's add will be the updated head
        second = head;// As this loop runs after the first block the nodes will be arranged alternatively
        head = head.next;
      }
    }// Now two diff blocks of ll are created
    first.next = null;//let the last pointer of the first be null
    second.next = null;
    
    first.next = reverse(secondHead.next);// directly put the first's tail to reverse of the secondHead's tail(second node of the second block)
    head = firstHead.next;// now start the ll from firsthead next node
    
    return head;
  }
}
