import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pdi(n);
  }
  
  public static void pdi(int n)
  {
    if(n == 0) return;
    
    pd(n);
    pi(n);
  }
  public static void pi(int n)
  {
    if(n == 0) return;
    
    pi(n-1);
    
    System.out.println(n);
  
  }
  
  public static void pd(int n)
  {
    if(n == 0) return;
    
    System.out.println(n);
    
    pd(n-1);
  }
}
