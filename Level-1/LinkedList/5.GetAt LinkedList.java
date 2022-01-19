//5. Get At Linked List
// Get Value In Linked List
// 3.1. getFirst - Should return the data of first element. If empty should return -1 and print "List is empty".
// 3.2. getLast - Should return the data of last element. If empty should return -1 and print "List is empty".
// 3.3. getAt - Should return the data of element available at the index passed. If empty should return -1 and print "List is empty". If invalid index is passed, should return -1 and print "Invalid arguments".

public int getFirst()//To get the first data of the ll
{
  if(size == 0)//when the list is empty
  {
    System.out.println("List is empty");
    return -1;
  }
  return head.data;//will return the data present in the head(index =0)
}

public int getLast()//to get the last data of the ll
{
  if(size == 0)
  {
    System.out.println("List is empty");
    return -1;
  }
  return tail.data;//will return data in tail(index = size-1(last))
}

public int getAt(int idx)//Given argument/parameter as the index at which the data is needed
{
  if(size == 0)//when ll is empty
  {
    System.out.println("List is empty");
    return -1;
  }
  if(idx<0 || idx>=size)//for the invalid index passed eg. for negative indexs and for index value greater than the available size of ll
  {
    System.out.println("Invalid arguments");
    return -1;
  }
  
  if(idx == 0) getFirst();
  if(idx == size-1) getLast();
  
  Node curr = head;//initializing the pointer to head of the ll to start the traversing of the ll
  for(int i =0;i<idx;i++) //loop for traversing th ll from 0 to the given index of the ll
  {
    curr = curr.next;//for updating the curr to next idx
  }
  return curr.data;// will return the data of the last elemnet of the traversed loop above eg. if idx = 2 the loop will traverse till 1 and the curr will be upated to curr.next which is 
  //idx =2 so the data in idx = 2 will be returned in the above.
}
