// Any Base To Decimal
// 1. You are given a number n.
// 2. You are given a base b. n is a number on base b.
// 3. You are required to convert the number n into its corresponding value in decimal number system.

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    
    int ans = anyBaseToDecimal(n,b);
    System.out.println(ans);
  }
  
  public static int anyBaseToDecimal(int n, int b)
  {
    int res = 0;
    int multiplier = 1;
    
    while(n>0)
    {
      int divisor = n/10;
      int rem = n%10;
      
      n = divisor;
      
      res = res + rem*multiplier;
      multiplier *= b;
    }
    return res;
  }
}
