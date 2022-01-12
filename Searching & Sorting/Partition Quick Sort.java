import java.io.*;
import java.util.*;

public class Main {
  public static void partition(int[] arr, int pivot){//partitioning is done around the last element to 1.get that ele to its correct index
    //in partitioning maintaining the order is not necessary || (numbers less than pivot value) pivot (numbers greater than pivot value) this condition is enough
    //write your code here
    int left = 0, right = 0;
    while(right < arr.length)
    {
    if(arr[right] > pivot) //if the arr element is greater than the target(pivot) then move the right pointer to right by 1
    {
      right++;
    }
    else // if the arr element is less than the pivot value then 
    {
      swap(arr,right, left);//swap the left and right pointer and update the left and right pointer by 1
      left++;
      right++;
    }
    }
 
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) { // swap code
    //System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {//5 7 -2 4 1 3 3
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();//-2 1 3 7 4 
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}
