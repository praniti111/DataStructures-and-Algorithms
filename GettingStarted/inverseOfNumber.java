//10. Inverse Of A Number

/* Inverse of a number is defined as the number created by changing the face value and index of place */

import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    inverseOfNumber(n);
  }
  
  public static void inverseOfNumber(int n)
  {
    int ofacev = 0;
    int oplacev = 1;
    int inverse = 0;
    
    while(n!=0)
    {
      ofacev = n%10;
      int ifacev = oplacev;
      int iplacev = ofacev;
      
      inverse = inverse + (ifacev * (int)Math.pow(10, iplacev-1));
      
      n = n/10;
      oplacev++;
    }
    System.out.print(inverse);
  }
}
