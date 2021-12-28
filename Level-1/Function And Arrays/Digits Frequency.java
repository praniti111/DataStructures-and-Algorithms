//1. Digits Frequency
/* Given n(number) and d(digit)
 to calculate the frequency of digit d in number n. */

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int f = getDigitFrequency(n,d);
    System.out.println(f);
  }
  
  public static int getDigitFrequency(int n, int d)
  {
    int freq = 0;// to maintain the count of the number of times the digit appers in the number
    
    while(n!=0)//run the loop till n is equal to 0
    {
      int digit = n%10;// to extract the last digit
      
      if(digit == d)//checks of the digit is equal to the given digit d
      {
        freq++;// if yes the count is increased by 1
      }
      n = n/10;// then the n is reduced by one digit from behind
    }
    return freq;// as the return type mentioned is int we return the count of the digits appeared int the number
  }
}

