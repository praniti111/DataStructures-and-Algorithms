/* 7.Digits of a Number 
    1. You've to display the digits of a number.
    2. Take as input "n", the number for which digits have to be displayed.
    3. Print the digits of the number line-wise.*/


import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) 
    {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();// 25

      digitsofno(n);
     }

     public static void digitsofno(int n)
     {
       int count = 0;
       int temp = n; //25
       
       while(temp!=0)
       {
           temp = temp/10; //25/10 = 2 || 2/10 = 0
           count++; // 2
       }

       int div = (int)Math.pow(10,(count-1)); //10raise to (2-1) = 10raise to 1

       while(div!=0)
       {
           int q = n/div; // q = 25/10 = 2 || q = 5/1 = 5
           System.out.println(q); //2 || 5

           n = n%div; // n = 25%10 = 5 || n = 5%1 =0
           div = div/10; //10/10 = 1 || 1/10 = 0 => loop terminates

       }
     }
    }
