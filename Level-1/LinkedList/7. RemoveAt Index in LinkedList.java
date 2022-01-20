//7. Remove At LinkedList 
//To remove the element at the index
public void removeAt(int idx)
{
  if(size==0)
  {
    System.out.println("List is empty");
    return;
  }
  
  if(idx<0 || idx>=size)
  {
    System.out.println("Invalid arguments");
    return;
  }
  
  if(idx == 0) removeFirst();//If the index is 0 i.e it is the first element sp remove first
  else if(idx == size-1) removeLast();// If the index is size-1 i.e last so remove last
  
  else
  {
    Node prev = head;// initialize a pointer(prev) to head of ll 
    for(int i =0;i<idx-1;i++)// Traverse the ll till one index before the index given 
    {
      prev = prev.next; // update the prev pointer with the next address of the prev node of the index
    }
    
    prev.next = prev.next.next;// after traversing and reaching the prev node of the idx update the next of the prev node with the next of the index node
    size--;// and reduce the size of the ll
  }
}
