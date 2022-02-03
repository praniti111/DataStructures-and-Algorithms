//1. Toggle Case
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.

import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    System.out.println(toggleCase(str));
  }
  
  public static String toggleCase(String str)
  {
    String res = "";
    for(int i = 0;i<str.length();i++)
    {
      char ch = str.charAt(i);
      
      if(ch>='a' && ch<='z')
      {
        // Lowercase alphabets
        //convert it to uppercase
        res = res + (char)(ch-32);
      }
      else
      {
        //uppercase alphabets
        //convert it to lowercase
        res = res+(char)(ch+32);
      }
    }
    return res;
  }
}
