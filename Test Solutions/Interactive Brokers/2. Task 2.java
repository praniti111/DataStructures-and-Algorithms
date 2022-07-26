/*Write a function solution that, given an  Array A of N integers, returns the largest integer K>0 such that both values K and -K exist in array A. if there is no such 
integer, the function should return 0.

Eg: A = [3,2,-2,5,-3] return 3 (both 3 and -3 exit in array A)
 A = [1,1,2,-1,2,-1] the function should return 1(both 1 and -1 exist in array A)
 A = [1,2,3,-4] the function should return 0(as there is no such K for which both values K and -k exist in array A)
 */
import java.util.*;
class solution{
  public static void main(String[] args){
    int first= 0;//let first be the first element of th array
    int last = A.length - 1;//let last be the last element of the array
    while(last>=first){// run the loop till the last index is greater than first
      if(A[last] == -A[first]){ // while in loop check if the last lement is same as the negative of the same element
        return Math.max(A[last], A[first]);// return the max value i.e the positive element 
      }
      last--; // move left of the array after checking
      first++;// move right of the array after checking
      
    }
    else{ //when the first index is greater than last then return 0
      return 0;
    }
  }
}
