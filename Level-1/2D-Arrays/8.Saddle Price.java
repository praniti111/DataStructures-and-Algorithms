import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            mat[i][i] = sc.nextInt();
        }

        for(int i=0;i<mat.length;i++)
        {
            int minCol = 0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]<mat[i][minCol])
                {
                    minCol = j;
                }
            }

            int maxRow = 0;
            for(int k = 0;k<mat.length;k++)
            {
                if(mat[k][minCol]>mat[minRow][maxCol])
                {
                    minRow = k;
                }
            }

        }
        if(maxRow == i)
        {
            System.out.print(mat[minRow][maxCol]);
            return;
        }

    }
    System.out.println("Invalid input");

}
