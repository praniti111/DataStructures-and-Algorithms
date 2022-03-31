import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printIncreasing(n);
  }
  
  public static void printIncreasing(int n)
  {
    //Base Case
    if(n == 0) return;
    
    //Faith
    printIncreasing(n-1);
    
    //Meeting Expectation with faith
    System.out.println(n);
    
  }
}
