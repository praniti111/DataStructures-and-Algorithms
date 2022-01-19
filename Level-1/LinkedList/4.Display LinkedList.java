//4.Display LinkedList
//Display or Traversing the LinkedList

public void display()
{
  for(Node curr = head;curr!=null;curr = curr.next)//traversing using for loop
  {
    System.out.print(curr.data+" ");
  }
  System.out.println();
  
  if(size==0)
  {
    return;
  }
  
  //OR
  Node curr = head;
  while(curr!=null)//Traversing uisng while loop
  {
    System.out.print(curr.data+" ");
    curr = curr.head;
  }
  System.out.println();
  
  if(size == )
  {
    return;
  }
  
}
