//6.Count Digits In A Number

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    countdigits(n);
  }
  
  public static void countdigits(int n)
  {
    int count = 0;
    
    while(n!=0)
    {
      n=n/10;
      count++;
    }
    System.out.print(count);
  }
}
