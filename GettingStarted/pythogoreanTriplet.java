// 14. Pythagorean Triplet

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c= sc.nextInt();
    
    pythogoraenTriplet(a,b,c);
  }
  
  public static void pythogoraenTriplet(int a, int b, int c)
  {
    if(b>a && b>c)
    {
      int temp = a;
      a = b;
      b = temp;
    }
    
    else if(c>a && c>b)
    {
      int temp = a;
      a=c;
      c=temp;
    }
    
    if(a*a == b*b + c*c)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
}
