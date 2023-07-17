//Q. https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Scanner;

public class Solution {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    if(ch>='A' && ch<='Z'){
      System.out.println(1);
    }
    else if(ch>='a' && ch<='z'){
      System.out.println(0);
    }
    else{
      System.out.println(-1);
    }
    
  }
}
