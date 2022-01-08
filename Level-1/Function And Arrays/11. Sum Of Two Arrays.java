//11. Sum Of Two Arrays
// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.
import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    // Take array inputs
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<n1;i++)
    {
      arr1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++)
    {
      arr2[i] = sc.nextInt();
    }
    
    //Ternary Operator = (condition)? true: false;
    int [] sum = new int[n1 > n2? n1:n2];// is n1 greater than n2 ? if true take n1 as input : if false take n2 as input as the index for the array sum
    
    int i = arr1.length - 1;// put the pointer i in arr1 from behind 
    int j = arr2.length - 1;
    int k = sum.length -1;
    
    int carry = 0;
    
    while(k>=0)// will iterate till the elements in the sum arr is not equal to 0
    {
      int d = carry;// take digit as carry which is initialized as 0
      
      if(i>=0)// iterate till there are elements in the arr1
      {
        d += arr1[i];// if true then add the digit in d
      }
      if(j>=0)// iterate till there are aelements in the arr2
      {
        d += arr2[j];// if true then add the digit to d
      }
      
      //After each iteration
      carry = d/10;// carry will get the divisor value which will be added to the next digits in array
      d = d%10;// digit will get updated as the remainder of the value which will get into the sum array
      
      sum[k] = d; // till the while loop of k is iterating keep updating the value d in the sum[k]
      
      i--;// move the pointer to the left after each iteration
      j--;
      k--;
    }
    //Outside of the loop
    if(carry!=0)//If carry is not yet 0 when iand j both are 0 then print the value of carry in the beginning of the answer(array)
    {
      System.out.println(carry);
    }
    
    //Advanced for loop which prints the elements directly ratjer than their indexs of the array sum in the varable var
    for(int var : sum)
    {
      System.out.println(var);
    }
  }
}
