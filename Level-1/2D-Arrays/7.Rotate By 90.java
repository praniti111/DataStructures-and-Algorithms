//7. Rotate BY 90
// given n*n numbers, representing elements of 2d array a.
//3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
       transpose(mat);
       swapColumns(mat);
       display(mat);

    }

    public static void swapColumns(int[][] arr)// After Transpose swap the columns 
    {
        int leftCol = 0, rightCol = arr[0].length-1;

        while(leftCol<rightCol)
        {
         for(int i = 0;i<arr.length;i++)
         {
             swap(arr, i,leftCol, rightCol);
         } 
          leftCol++;
          rightCol--;  
        }
    }

    public static void swap(int[][] arr, int i, int leftCol, int rightCol)// Swap the columns
    {
        int temp = arr[i][leftCol];
        arr[i][leftCol] = arr[i][rightCol];
        arr[i][rightCol] = temp;
    }

    public static void swap(int[][] arr, int i, int j)// Swap to transpose the matrix ie. swap the upper or lower triangle but not both
    {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void transpose(int[][] arr)// To transpose the matrix ie. the a[i][j] = a[j][i] as to change from rows to columns
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                swap(arr, i, j);
            }
        }
    }

    public static void display(int[][] arr){// Function to display the linkedlist
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
