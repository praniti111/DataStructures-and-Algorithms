//Print All Primes Till N

import java.util.*;

public class Main{
    public static void main(String[] args) 
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low =sc.nextInt();
        int high = sc.nextInt();

        printPrimes(low,high);
        
    }

    public static void printPrimes(int low, int high)
    {
        for(int i = low;i<=high;i++)
        {
        int count = 0;
            for(int lv = 2; lv*lv <=i;lv++)
            {
                if(i%lv == 0)
                {
                    count++;
                    break;
                }
            
            }
            if(count == 0)
            {
                System.out.println(i);
            }

        }
    }
}
