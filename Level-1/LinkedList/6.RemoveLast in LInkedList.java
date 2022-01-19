//6. Remove Last In LinkedList

public class Main
{
public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;
  }

public void removelast()
{
  if(size == 0)
  {
    System.out.println("List is empty");
    return;
  }
  if(size == 1)// When there is only one element in the ll then head and tail both will be null
  {
    head = tail = null;
  }
  else // traverse till 2nd last element in the ll as the last on will be removed
  {
    Node prevTail = head;// initialize the pointer to head
    for(int i = 0; i<size-2; i++)// traverse till the 2nd last element (size-2) 
    {
      prevTail = prevTail.next;//  update prevTail with the next add
    }
    prevTail.next = null;// now update the prevTail's next with null 
    tail = prevTail;//and update tail with the prevTail i.e. is second last element
  }
  size --;// reduce the size by 1
}
}
