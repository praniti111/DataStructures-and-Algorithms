// Q: https://www.codingninjas.com/studio/problems/data-type_8357232?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

import java.util.Scanner;

public class Solution{
  public static int dataTypes(String type){
    if(type.equals("Integer") || type.equals("Float")){
      return 4;
    }
    else if(type.equals("Long") || type.equals("Double")){
      return 8;
    }
    else if(type.equals("Character")){
      return 1;
    }
    return 0;
  }
}
