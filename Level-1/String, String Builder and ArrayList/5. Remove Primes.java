//5. Remove Primes -remove prime numbers from the given ArrayList and return the updated ArrayList
import java.util.*;
import java.io.*;

class Main
{

public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  ArrayList<Integer> al = new ArrayList<>();
  for(int i = 0; i<n; i++)
  {
    al.add(sc.nextInt());//syntax to take arraylist input
  }
  solution(al);
  System.out.println(al);
}
  
  public static void solution(ArrayList<Integer> al)
  {
    for(int i = al.size()-1;i>=0;i--)// start from right to left to avoid skipping elements, as if we start from first and the first ele is removed(when prime) then the arrlist shifts to left
    {                                
      if(isPrime(al.get(i)))
      {
        al.remove(i);
      }
    }
  }
  
  public static boolean isPrime(int x)// code to check if prime
  {
    for(int i=0;i*i<=x;i++)
    {
      if(x%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
