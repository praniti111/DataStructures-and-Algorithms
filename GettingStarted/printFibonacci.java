//5. Print Fibonacci Numbers Till N
import java.util.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    printFibonacci(n);
  }
  public static void printFibonacci(int n)
  {
    int a =0;
    int b =1;
    int c;
    
    for(int i=0;i<n;i++)
    {
      c = a+b;
      System.out.println(a);
      a = b;
      b = c;
    }
  }
}
