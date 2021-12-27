// 11. GCD AND LCM
/* GCD or HCF = Greatest common divisor or Highest common Factor
LCM = Lowest Common Multiple */

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    gcdlcm(n1,n2);
  }
  
  public static void gcdlcm(int n1, int n2)
  {
    int on1 =n1;
    int on2 = n2;
    
    //To calculate gcd
    while(n1%n2!=0)
    {
      int rem = n1%n2;
      n1 =n2;
      n2 = rem;
    }
    int gcd = n2;
    System.out.println(gcd);
    
    //To calculate lcm
    int lcm = (on1 * on2)/gcd;
    System.out.println(lcm);
  }
}
