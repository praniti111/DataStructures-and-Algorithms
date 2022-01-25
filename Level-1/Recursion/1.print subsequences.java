import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        printSS(0,input,"");
        

    }

    public static void printSS(int idx, String input, String output) 
    {
        //Positive base case
        if(idx == input.length())
        {
            System.out.println(output);
            return;
            
        }
        

        //Corner cases
        char ch = input.charAt(idx);

        //yes
        printSS(idx+1,input,output+ch);

        //no
        printSS(idx+1,input,output);
        
    }

}
