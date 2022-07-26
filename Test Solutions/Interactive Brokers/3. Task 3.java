/* There are N coins, each showing either heads or tails. We would like all the coins to form a sequence of alternating heads and tails. 
What is the minimum number of coins that must be reversed to achieve this?
 Write function 
 class Solution{
 public int solution(int[] A);
 }
 that, given an Array A consisting of N integers representing the coins, returns the mininmum number of coins that must be reversed. 
 Consecutive elelments of array A represent consecutive coins and contain either a 0(heads) or a 1(tails).
 
 Eg: A=[1,0,1,0,1,1] return 1 (last 1 to be reversed to get 0)
  A=[1,1,0,1,1] return 2 (1st and 5th to be reversed)
  A=[0,1,0] return 0(no change)
  A=[0,1,1,0] return 2(1st and 2nd reversed)
  
  Solved by using two pointers C1 and C2
  */
import java.util.*;
class Solution{
  public static void main(String[] args){
    if((A.length)=0){
      return 0;
    }
    for(int i=0, i<=A.length-1;i++)
    {
      if(i%2=0)//Array is even 
      {
        if(A[i]==1){
          c1++;
        }
        if(A[i]==0){
          c2++;
        }
      }
      else
      {
        if(A[i] ==1)
        {
          c2++;
        }
        if(A[i]==0)
        {
          c1++;
        }
      }
    }
    return Math.min(c1,c2);//return the minimum number of times the pointers ahve reversed
  }
}
