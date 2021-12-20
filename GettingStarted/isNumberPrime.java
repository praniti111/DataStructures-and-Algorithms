/*Is Number Prime
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise. */

import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // input for how many numbers are being evaluated
    int lv_t = 1; // Looping variable of t = 1;
    
    while(lv_t <= t)
    {
      int n = sc.nextInt(); // The number you want to find out if it is prime or not prime 
      int lv = 2; // Looping variable = 2; as 1 is always a factor
      int count = 0; // To count the number of factors
      
      while(lv * lv <= n) // Check only till root n as the factors after that are repeating eg: 36 = 1 * 36
      {                                                                                       //36 = 2 * 18
        if(n%lv == 0) //if n is divisible by lv totally then it has factors so it cant be prime //36 = 3 * 12
        {                                                                                     //36 = 4 * 9
          System.out.println("not prime");                                                    //36 = 6 * 6 --> the elements after this are repeating
          count++;                                                                            //36 = 9 * 4 // repeating
          break;                                                                              //36 = 12 * 3 // repeating
        }                                                                                     //36 = 18 * 2 //repeating
        else                                                                                  //36 = 36 * 1 //repeating
        {
          lv++; // lv to go to the next factor
        }
      }
      if(count == 0)//if there are no factors then the count will be 0 and the number will be prime
      {
        System.out.println("prime");
      }
      lv_t++; // lv to go to the next number after deciding it is prime or not
    }
  }
}
