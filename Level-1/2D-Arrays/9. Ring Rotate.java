//9. Ring Rotate 
//You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
//You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int [][] arr = new int[n][m];
    for(int i = 0;i<n;i++)
    {
      for(int j = 0;j<m;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    
    int s = sc.nextInt();
    int r = sc.nextInt();
    
    rotateShell(arr, s, r);
    display(arr);
  }
  
  public static void rotateShell(int[][] arr, int s, int r)// Rotate Shell - the whole shell
  {
    int[] oned = extractOnedfromShell(arr, s);//1. Extract oned array from shell
    rotate(oned, r);//2. Rotate the oned array extracted
    extractShellfromOned(arr, s, oned);// 3.Extract shell elements from oned array
  }
  
  public static void rotate(int[] oned, int r)// To rotate the oned array extracted
  {
    reverse(oned, 0, oned.length-r-1);
    reverse(oned, oned.length-r, oned.length-1);
    reverse(oned, 0, oned.length-1);
  }
  
  public static void reverse(int[] oned, int li, int ri)// to reverse the array for using it in rotate function
  {
    while(li<ri)
    {
      int temp = oned[li];
      oned[li] = oned[ri];
      oned[ri] = temp;
      
      li++;
      ri--;
    }
  }
  
  public static int[] extractOnedfromShell(int[][] arr, int s)// 1.Extract Oned array from the Shell
  {
    int minr = s-1;//Min row and min col start from the same idx in the top left 
    int minc = s-1;
    int maxr = arr.length -s;
    int maxc = arr.length-s;
    
    int sz = 2*(maxr-minr + maxc-minc);// Size of the oned array lw + bw + rw + tw = and donot condsider the ele repeated so if s = 2 then 
                                       //minr = minc = (s-1) = 2-1 = 1 (1,1)|| maxr = maxc = (arr.length-s) = 7-2 = 2 (5,5)
    int [] oned = new int[sz];
      
    // To traverse along the specific shell and extracting the elements in the oned array
    //lw //left col(top to bottom)
    int idx = 0;
      for(int i = minr, j=minc;i<=maxr;i++)
      {
        oned[idx] = arr[i][j];
        idx++;
      }
    
    //bw //bottom //bottom row(left to right)
    for(int i = maxr, j=minc+1;j<=maxc;j++)
      {
        oned[idx] = arr[i][j];
        idx++;
      }
    
    //rw //right //right col(bottom to up)
    for(int i = maxr-1, j=maxc;i>=minr;i--)
      {
        oned[idx] = arr[i][j];
        idx++;
      }
    
    //tw // top //top row(right to left)
    for(int i = minr, j=maxc-1;j>=minc+1;j--)
      {
        oned[idx] = arr[i][j];
        idx++;
      }
    return oned;// return the oned array
  }
  
  public static void extractShellfromOned(int[][] arr, int s, int[] oned)// 3. after rotating the oned array put the arry in same order int he shell
  {
    int minr = s-1;
    int minc = s-1;
    int maxr = arr.length -s;
    int maxc = arr.length-s;
    
    int sz = 2*(maxr-minr + maxc-minc);
    //int [] oned = new int[sz];
      
    //lw
    int idx = 0;
      for(int i = minr, j=minc;i<=maxr;i++)
      {
        arr[i][j] = oned[idx];// Now the arr in the shell is being filled from the oned array
        idx++;
      }
    
    //bw
    for(int i = maxr, j=minc+1;j<=maxc;j++)
      {
        arr[i][j] = oned[idx];
        idx++;
      }
    
    //rw
    for(int i = maxr-1, j=maxc;i>=minr;i--)
      {
        arr[i][j] = oned[idx];
        idx++;
      }
    
    //tw
    for(int i = minr, j=maxc-1;j>=minc+1;j--)
      {
        arr[i][j] = oned[idx];
        idx++;
      }
    
  }
  
     public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

