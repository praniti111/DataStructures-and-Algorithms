/*Is Number Prime
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise. */

import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int lv_t = 1;
    
    while(lv_t <= t)
    {
      int n = sc.nextInt();
      int lv = 2;
      int count = 0;
      
      while(lv * lv <= n)
      {
        if(n%lv == 0)
        {
          System.out.println("not prime");
          count++;
          break;
        }
        else
        {
          lv++;
        }
      }
      if(count == 0)
      {
        System.out.println("prime");
      }
      lv_t++;
    }
  }
}
