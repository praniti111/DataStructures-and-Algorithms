//3. Remove First in LinkedList
//{10,20,30} => {20,30} =>{30} =>{}
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
    
    //1. Create the new Node
    Node temp = new Node();
    //There no data updation here as we are removing the node 
    
    if(size>1)// if size greater than 1
    {
      head = head.next;// update the head with its next node address
    }
    else if(size == 1)// if there is only one element in the list and u delete that the list becomes empty so head = tail =null
    {
      head = tail = null;
    }
    else // if the size =0 or list is empty then print
    {
      System.out.println("List is empty");
      return;
    }
    
  }
}
