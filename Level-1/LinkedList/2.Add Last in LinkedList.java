//2. Add Last in LinkedList
//{} => {10} => {10,20} => {10,20,30}

import java.util.*;
public class Main
{
  public static class Node//Node is a class
  {
    int data;
    Node next;//here node is a datatype //This kind of relation is called self= referancing 
  }
  
  public static class LinkedList
  {
    Node head;//here head and tail and size are private they wont be shown along with class LinkeList // they are abstracted from the user
    Node tail;
    int size;
    
    void addLast(int val)
    {
      Node temp = new Node();//1.created new Node
      temp.data = val;//upadate the data of the temp as the value gieven in the parameteres
    
    if(size == 0)//2. when Linkedlist is empty
    {
      head = temp;//when size =0 (there r no elements ll is empty then head and tail pointers both point to the first element being inserted)
      tail = temp;
    }
    else//3. When there are elements in LinkedList
    {
      tail.next = temp;// the previous last tail's next will store the new temp address
      tail = temp;//and then update tail to new temp address
    }
    size++;// as there is last element being added the size increase
    }
    
  }
}
