//10. Bar Chart
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.
import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    
    int maximum = max(arr,n);
    barchart(arr, n, maximum);
  }
  
  public static int max(int[] arr, int n)
  {
    int maxv = Integer.MIN_VALUE;//(MINVALUE TO +INFINITY)
    
    for(int i=0;i<n;i++)
    {
      maxv = Math.max(arr[i], maxv);
    }
    return maxv;
  }
  
  public static void barchart(int[] arr, int n, int maximum)
  {
    int totalrows = maximum;// as the number of rows will be equal to the maximum number in the given array(as we have to print the stars)
    int totalcols = n;// total columns will be equal to the number of elements in the array can be taken as arr.length too
    
    //For loop for rows
    for(int i = totalrows-1;i>=0;i--)// loop will run from top to bottom as the index of the array starts from 0 we sart i from totalrows -1; and go till i is greater than 0
    {
      for(int j = 0;j<totalcols;j++)//for loop for columns will start from left to right till the number of elemnets in the arr
      {
        if(i<arr[j])// if index of the rows is less than the array element (element which is present in index j )
        {
          System.out.print("*\t");// print a star which will print the number of starts less than the element in the array
        }
        else
        {
          System.out.print("\t");//else print space
        }
      }
      System.out.println();// after running the loop for column one to shift to the next col print nextLine.
    }
  }
  
}
