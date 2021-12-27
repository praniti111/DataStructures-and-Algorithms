// 13. Curious Case Of Benjamin Bulbs
/* Concept : The bulbs remain ON for odd number of fluctuations which means 
The number with odd number of factors the bulb will remain ON;
The perfect squares have odd fluctuations i.e.(2N+1) factors 
So print all prerfect squares till the input number */

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    
    ccbb(n);
  }
  
  public static void ccbb(int n)
  {
    for(int lv=1;lv*lv<=n;lv++)
    {
      System.out.println(lv*lv);
    }
  }
}
