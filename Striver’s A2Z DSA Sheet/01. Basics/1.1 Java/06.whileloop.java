//Q: https://www.codingninjas.com/studio/problems/sum-of-even-odd_624650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

import java.util.*;
public class Main{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int even = 0;
    int odd = 0;

    while(n!=0){
      int rem = n%10;
       if(rem%2 == 0){
        even = even+rem;
        }
       else{
      	odd = odd + rem;
        }
      n = n/10;
  	}
    System.out.print(even);
    System.out.print(" ");
    System.out.println(odd);
	}
}
