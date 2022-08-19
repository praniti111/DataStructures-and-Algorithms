/* Code 1: Amazon Shopping provides a product-search feature that makes browsing products easier.
Instead of showing exact matches only, it also displays transformable results for better browsing. 
A word a is said to be transformable to a word b if a is a subsequence of b, Given searchWord and resultWord, 
find the minimum number of characters that must be append at the end of searchWord, such that resultWord is a subsequence of the modified searchWord.

Note: A subsequence of a string is a string that results from deleting 0 or more characters from the string without changing the order of the remaining characters.
For Eg: amazon is a subsequence of abcmmdaqzxopn while abc is not a subsequence of cdhbqaab.

Eg: 
searchWord = "armaze"
resultWord = "amazon"

ar maz e -> a r maz e o -> a r maz e on 
                                |
                                amazon(Expected result word, a subsequence of search word)
                                
Add 2 characters, 'on', to searchWord to make resultWord, a subsequence of searchWord.

Function Description
Complete the function findMinimumCharacters in the editor below

findMinimumCharcters ha the following parameters:
string searchWord: the search word, to which characters are appended
string resultWord: the result word, which should be a subsequence of searchWord

Returns:
int: the mininmum number of characters to be appended to searchWord, to make resultWord transformable to searchWord.

Constraints:
1. 1<= |searchWord|, |resultWord|<=10^5 where, |X| represents the length of the string x.
2. searchWord and resultWord consist of lowercase English letters only.


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
