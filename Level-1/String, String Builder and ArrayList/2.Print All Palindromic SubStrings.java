//2. Print All Palindromic SubStrings
//1. You are given a string. 
//2. You have to print all palindromic substrings of the given string.

import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    solution(str);
  }
  
  public static void solution(String str)
  {
    for(int i = 0;i<str.length();i++)// Start from the first element to the last
    {
      for(int j = i;j<str.length();j++)// Start from where the i's next element to the last so that u get all the elements strating from 2nd or 3rd character
      {
        String substr = str.substring(i,j+1);// create a new string which will contain the new substring based on the loop
        if(isPalindromic(substr))// check if the new substring is palindrome or not
        {
          System.out.println(substr);// if yes print the substring
        }
      }
    }
  }
  
  public static boolean isPalindromic(String substr)// Code to check if the new substring formed is palindromic or not
  {
    int left = 0, right = substr.length()-1; // let a pointer be at the first ele and second at the last
    while(left<right)// run the loop till left is less than right
    {
      if(substr.charAt(left) != substr.charAt(right))// if the character at left is not equal tot he character at right then it is not palindromic
      {
        return false;//if the characters are not equal then return false
      }
      left++;// move the pointers to left by one and right to left by one
      right--;
    }
    return true;// else return true
  }
}
