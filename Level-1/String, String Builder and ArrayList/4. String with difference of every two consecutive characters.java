//4. String with the differance of every two concequtive characters
// a string that contains the difference of ASCII values of every two consecutive characters between those characters.
  // For "abecd", the answer should be "a1b3e-2c1d"

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.print(solution(str));
  }
  
  public static String solution(String str)
  {
    StringBuilder res = new StringBuilder();// StringBuilder is used as we have to update the string
    
    for(int i=0;i<str.length()-1;i++)// Run till all the string length
    {
      res.append(str.charAt(i));// Append is used to add the element to the last 
      res.append(str.charAt(i+1) - str.charAt(i));// Differance between the index and next
    }
    res.append(str.charAt(str.length()-1));// Corner case: to add the last element of the string
    return res.toString();// toString() Method converts any datatype to String and returns it, her converts SB.
    
  }
  
}
