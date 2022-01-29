//1.Normal Stack
// 2.1. push -> Should accept new data if there is space available in the underlying 
//    array or print "Stack overflow" otherwise.
//    2.2. pop -> Should remove and return last data if available or print "Stack 
//    underflow" otherwise and return -1.
//    2.3. top -> Should return last data if available or print "Stack underflow" 
//    otherwise and return -1.
//    2.4. size -> Should return the number of elements available in the stack.
//    2.5. display -> Should print the elements of stack in LIFO manner (space- 
//    separated) ending with a line-break.

import java.io.*;
import java.util.*;


public class Main {

  public static class CustomStack { // 
    int[] arr;
    int top;

    public CustomStack(int cap) {
      arr = new int[cap];
      top = -1;
    }
    
    int size()
    {
      return top+1;
    }
    
    void display()
    {
      for(int i = top;i>=0;i--)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    
    void push(int val)
    {
      if(top == arr.length -1)
      {
        System.out.println("Stack overflow");
        return;
      }
      top++;
      arr[top] = val;
    }
    
    int pop()
    {
      if(top == -1)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      
      int val = arr[top];
      top--;
      return val;
    }
    
    int top()
    {
      if(top==-1)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      int val = arr[top];
      return val;
    }
  }
