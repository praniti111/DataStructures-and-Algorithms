//7. AnyBase Multiplication
//1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    int d = getProduct(b,n1,n2);
    System.out.println(d);
  }
  
  public static int getProduct(int b, int n1, int n2)
  {
    int ans = 0;
    int multiplier = 1;
    while(n2>0)
    {
      int d2 = n2%10;
      n2 = n2/10;
      
      //product with second digit
      int pwsd = gpwsd(b, n1, d2);
      
      ans = anyBaseAddition(b, ans, pwsd*multiplier);
      multiplier *= 10;
    }
    return ans;
  }
  
  public static int gpwsd(int b, int n1, int d2)
  {
    int carry = 0;
    int res = 0;
    int multiplier = 1;
    
    while(n1>0 || carry>0)
    {
      int d1 = n1%10;
      n1 = n1/10;
      int temp = d1 * d2 + carry;
      
      int quo = temp/b;
      int rem = temp%b;
      
      carry = quo;
      res = res + rem*multiplier;
      multiplier *=10;
    }
    return res;
  }
  
  public static int anyBaseAddition(int b, int n1, int n2)
  {
    int res = 0;
    int carry = 0;
    int multiplier = 1;
    
    while(n1>0 || n2>0 || carry>0)
    {
      int d1 = n1%10;
      int d2 = n2%10;

      n1 = n1/10;
      n2 = n2/10;
      
      int temp = d1+d2+carry;
      
      int quo = temp/b;
      int rem = temp%b;
      
      carry = quo;
      res = res + rem*multiplier;
      multiplier *= 10;
    }
    return res;
  }
}
