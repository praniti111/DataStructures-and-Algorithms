// 5.Any Base To Any Base
// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sourcebase = sc.nextInt();
    int destbase = sc.nextInt();
    
    int res = anyBaseToDecimal(n, sourcebase);
    System.out.println(decimalToAnyBase(res, destbase));
  }
  
  public static int anyBaseToDecimal(int n, int b1)
  {
    int res = 0;
    int mult = 1;
     while(n>0)
     {
       int div = n/10;
       int rem = n%10;
       
       n = div;
       res = res + rem*mult;
       mult *= b1;
     }
    return res;
  }
  
  public static int decimalToAnyBase(int res, int b2)
  {
    int resf = 0;
    int mult = 1;
    while(res>0)
    {
      int div = res/b2;
      int rem = res%b2;
      
      res = div;
      resf = resf + rem*mult;
      mult *= 10;
    }
    return resf;
    
  }
}
  
  public static int decimalToAnyBase(int res, int b2)
  {
    int resf = 0;
    int mult = 1;
    while(res>0)
    {
      int div = res/b2;
      int rem = res%b2;
      
      res = div;
      resf = resf + rem*mult;
      mult *= 10;
    }
    return resf;
    
  }
}
