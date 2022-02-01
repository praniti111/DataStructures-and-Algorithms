//8. Saddle Price

//3. The saddle price is defined as the ""least price in the row but the maximum price in the column of the matrix.""

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0;i<n;i++)// Matrix input
        {
            for(int j = 0;j<n;j++)
            {
            mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<mat.length;i++)// Run the loop for the rows 
        {
            //To find the minimum element in the row
            int minCol = 0;// traverse the columns of that row

            for(int j=0;j<mat[0].length;j++)// Traversing the columns
            {
                if(mat[i][j]<mat[i][minCol])//Check if the first element is less than the element of the same row but next column
                {
                    minCol = j;// if yes the update the column to the minCol to maintain the minimum Column(ie. min elemnt on the row is found as all the number r unique)
                }
            }

            int maxRow = 0;// To get the maximum in the Column so traverse along the row
            for(int k = 0;k<mat.length;k++)// Traversing along the row to find the max in col
            {
                if(mat[k][minCol]>mat[maxRow][minCol])// Check if in that col along the row if the element grater than the tarversing elemnt
                {
                    maxRow = k;//if yes update maxCol to k
                }
            }

        
        if(maxRow == i)// if the number of iterations is same as the current MaxRow then print the element of the matrix with the last maxRow and minCol
        {
            System.out.println(mat[maxRow][minCol]);
            return;
        }

        }

    System.out.println("Invalid input");// The loop doesnt satisfy the conditions then it will come out and print for invalid output
    }

}
