import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        String input = sc.next();

        printEncodings(0,input,"");
    }
    public static void printEncodings(int idx, String input, String output) 
    {
        //Positive base case
        if(idx == input.length())
        {
            System.out.println(output);
            return;
        }

        //Corner Cases
        // for Single numbers
        int ch1 = input.charAt(idx)-'0';
        if(ch1>=1 && ch1<=9)
        {
            printEncodings(idx+1,input,output + (char)('a'+ ch1-1));
        }

        //for Double numbers
        if(idx+1<input.length())
        {
        int ch2 = (input.charAt(idx)-'0')*10 + (input.charAt(idx+1)-'0');
        if(ch2>=10 && ch2<=26)
        {
            printEncodings(idx+2, input, output + (char)('a'+ch2 - 1));
        }
        }
        
    }
}
