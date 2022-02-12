//3. String Compression
/*2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".*/
import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
  
  public static String compression1(String str) //Code for compression1 
  {
    String output = "";
    for(int idx = 0;idx<str.length();idx++)// Check till string is completed
    {
      if(idx == 0 || str.charAt(idx)!=str.charAt(idx-1))// if the idx is 0 (frist ele) then return output elsecheck if the idx and the ele befor that are same?
      {
        output = output + str.charAt(idx); // if yes then only return the first element off the repeating ele
      }
    }
    return output;//return based on desision taken
  }
  
  public static String compression2(String str)// Code for compression2
  {
    String output = "";
    int freq = 0; // Take the frequency count as 0
    for(int idx = 0;idx<str.length();idx++)
    {
      if(idx==0 || str.charAt(idx)!=str.charAt(idx-1))
      {
        if(idx >0 && freq>1) // check if the elemnet is not the first element
        {
          output = output + freq;// if not then print the element along with the number of times it got repeated
        }
        output = output + str.charAt(idx);//else get only the element
        freq = 0;//update the frequrncy to 0 again for a new diff element count
      }
      freq++; 
    }
    if(freq>1) //for the last element check if the freq is stilled remained then print the element alnong with the fre
    {
      output = output + freq;
    }
    return output;
  }
}
