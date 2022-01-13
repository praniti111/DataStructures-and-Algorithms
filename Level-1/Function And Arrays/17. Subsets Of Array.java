//17. Subsets Of Array

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all subsets of arr. Each subset should be
// on separate line

import java.util.*;
public class Main
{
  public static int decimaltoanybase(int n)//Decimal to AnyBase code for getting the binary number
  {
    int res =0, multiplier= 1;
    while(n!=0)
    {
      int quo = n/2;
      int rem = n%2;
      n = quo;
      
      res = res +rem*multiplier;
      multiplier *= 10;
    }
    return res;
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);//Array input
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    
    int totalsubsets = (int)Math.pow(2,n);// Total subsets is 2raise to n and the rows will be from 0 to 2raise to n-1;
    
    for(int dec = 0; dec <totalsubsets;dec++)
    {
      int binaryNo = decimaltoanybase(dec);//get the binary numbers from the decimal no.
      int power = (int)Math.pow(10,n-1);//power to extract the first digits of the binary numbers
      
      for(int i=0;i<n;i++)// loop to traverse along the binary number
      {
        int bit = (binaryNo/power)%10;// To get the first bit of the binary number || %10 gives the last element of the binary/power
        
        if(bit == 1)//if the bit is 1 then print the array elemnt in that index
        {
          System.out.print(arr[i]+"\t");
        }
        else// else print -
        {
          System.out.print("-\t");
        }
        power /= 10;// after each iteration the power reduces to 10 to get first n numbers
      }
      System.out.println();// next line after each iteration over binary number.
    }
  }
}
