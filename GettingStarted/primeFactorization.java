//12. Prime Factorization of a number

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    primeFact(n);
  }
  
  public static void primeFact(int n)
  {
    for(int div=2; div*div<=n;div++)
    {
     while(n%div==0)
     {
       n = n/div;
       System.out.print(div + " ");
     }
    }
    if(n!=1)
    {
      System.out.print(n);
    }
  }
}
