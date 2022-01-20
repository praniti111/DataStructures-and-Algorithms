//8. Add At index in Linked list
//To add a new node at the given index specified

public void addAt(int idx, int val)
{
  if(idx <0 || idx> size)
  {
    System.out.println("Invalid arguments");
    return;
  }
  
  if(idx == 0) addFirst(val);//if the given index is 0 i.e first node then call addFirst()
  else if(idx == size) addLast(val);// if the given index is size (Note : the index given is givn in the form of index so we donot need to change it to index again) 
  //so  if the given index is equal to the size then it has to create a new node at last
  
  else
  {
    Node temp = new Node();// Create a new Node
    temp.data = val;// Upadte the new nodes data with the val given
    Node prev = head;// To traverse along ll inintiaze a prev pointer
    for(int i = 0; i<idx-1;i++)// Traverse till idx-1 i.e previous node
    {
      prev = prev.next;// update prev
    }
    
    temp.next = prev.next;// 1. update the new node's next with prev's node's next(which is the next node of the temp|| which was the next node of prev before creating new node)
    prev.next = temp;//2. update the prev node's next with the temp(new) node's address
    size++;// add size by 1 to add a new node
  }
}
