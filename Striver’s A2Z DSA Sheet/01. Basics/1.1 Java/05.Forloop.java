//Q: https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

import java.util.*;
public class Solution{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int a = 0;
    int b= 1;
    int c=0;
    for(int n=1;n<=N;n++){
      c = a+b;
      a = b;
      b = c;
    }
    System.out.println(a);
  }
}
