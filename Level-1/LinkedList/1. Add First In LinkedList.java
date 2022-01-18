//1. Add First In LinkedList
//{} => {10} => {20,10} => {30,10,20}
//head, tail, size
import java.util.*;
public class Main
{
  public static class Node
  {
   int data;
    Node next;
  }
  
  public static class LinkedList
  {
    Node head;
    Node tail;
    int size;
    
    void addFirst(int val)
    {
      Node temp = new Node();
      temp.data = val;
      
      if(size==0)
      {
        head = temp;
        tail = temp;
      }
      else
      {
        temp.next = head;
        head = temp;
      }
    }
  }
  
}
