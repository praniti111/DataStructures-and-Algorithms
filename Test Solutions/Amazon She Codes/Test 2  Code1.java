/* Code 1: Amazon Shopping provides a product-search feature that makes browsing

*/
import java.util.*;
import java.io*;

class Result{
  public static int findMinimumCharacters(String searchWord, String resultWord){
    int j=0;
    for(int i=0;i<searchWord.length();i++){
      if(j==resultWord.length()) break;
      if(searchWord.charAt(i)==resultWord.charAt(j)){
        j++;
      }
    }
    return resultWord.length()-j;
  }
}

public class Solution{}
