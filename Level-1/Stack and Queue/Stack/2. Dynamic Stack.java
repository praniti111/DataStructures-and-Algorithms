//2. Dynamic Stack
//  2.1. push -> Accepts new data if there is space available in the underlying array or 
//      print "Stack overflow" otherwise
//      2.2. pop -> Removes and returns last data if available or print "Stack underflow" 
//      otherwise and returns -1
//      2.3. top -> Return last data if available or print "Stack underflow" otherwise and 
//       returns -1
//      2.4. size -> Returns the number of elements available in the stack
//      2.5. display -> Print the elements of stack in LIFO manner (space-separated) 
//      ending with a line-break.

void push(int val) { // Array is a static data stucture and ArrayList and Linkedlist are dynamic data stuctures || if the data stucture is dynamic then the elements can be added
      //at any point of time but itn static if u specify a number then it creats only that many number of index in array so we need to use doubling to increase the index in array
      
      if (tos == data.length - 1) {//How to implement stack dynamically by array = Use DOUBLING
        int[] temp = new int[2 * data.length]; // double the size of the array
        for(int i = 0;i<data.length;i++)// First insert the previous elements of the array in the new created array
        {
            temp[i] = data[i];
        }
        data = temp; // to shift the referance variable to new created array
      } 
        tos++;
        data[tos] = val; // add the new element after the prev elemets are added in the array
      
    }
