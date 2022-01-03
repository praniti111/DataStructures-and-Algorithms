//5. AnyBase Addition
// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to add the two numbes and print their value in base b.

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int b = sc.nextInt();
    
    int ans = anyBaseAddition(n1,n2,b);
    System.out.println(ans);
  }
  
  public static int anyBaseAddition(int n1, int n2, int b)
  {
    int carry = 0;
    int mult = 1;
     int res = 0;
    
    while(n1>0 || n2>0 || carry>0)
    {
      int d1 = n1%10;
      int d2 = n2%10;
      
      n1 = n1/10;
      n2 = n2/10;
      
      int temp = carry + d1 + d2;
      
      int quotient = temp/b;
      int rem = temp%b;
      
      carry = quotient;
      
      res = res + rem*mult;
      mult *= 10;
      
    }
    return res;
  }
}
