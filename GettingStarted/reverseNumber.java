// 8. Reverse a Number

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Sacnner(System.in);
    int n = sc.nextInt();
    
    reverseNumber(n);
  }
  
  public static void reverseNumber(int n)
  {
    while(n!=0)
        {
            int rem = n%10; // rem = 25%10 = 5 || rem = 2%10 = 2
            n = n/10; //n = 25/10 = 2 || n = 2/10 = 0
            System.out.println(rem);// 5 || 2
        }
  }
}
