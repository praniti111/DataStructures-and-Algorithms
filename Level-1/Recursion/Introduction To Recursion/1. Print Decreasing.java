import java.util.*;
import java.io.*;

public class Main{ 

public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  printDecreasing(n);
}

public static void printDecreasing(int n)
{
  //Base case: Gives condition where the recursion terminates
  if(n == 0) return;
  
  //Expectation meeting with faith
  System.out.println(n);// While decreasing the number has to print first and then keep faith.
  
  //Faith: This is where the function calls itself and has a faith that it will complete the further function call and return to the function which has called it
  printDecreasing(n-1);
}
}
