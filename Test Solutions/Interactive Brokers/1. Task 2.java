/* Write a function solution that, given an array A and N integers(between -100 and 100) returns the sign(-1,0,1) of the project of all the numbers in the array multiplied togather. 
Assume that N is between 1 and 1000.

Eg: A=[1,-2,-3,5] return 1
A=[1,2,3,-5] reyurn -1
A=[1,2,0,-5] returns 0 */

import java.util.*;
class Solution{
  public int solution(int[] A){
    int count =0;
    for(int i=0;i<=A.length-1;i++){
      if A[i]=0 return 0;
      if(A[i]<=0){// to check how many -ve signs are present
        count++;
      }
      if(count%2==0){// To check if there are even number of negative signs
      return 1;// if even then the number is positive
      }
      else{
      return -1;// if odd the number is negative 
      }
      
    }
  }
}
