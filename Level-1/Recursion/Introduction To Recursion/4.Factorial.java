import java.util.*;
import java.io.*;

public class Main{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f = factorial(n);
    System.out.println(f);
  }
  
  public static int factorial(int n)
  {
    //Base Case
    if(n==1) return 1;
    
    //Faith
    int ans = n * factorial(n-1);
    
    //Expectation meeting faith
    return ans;
  }
}

