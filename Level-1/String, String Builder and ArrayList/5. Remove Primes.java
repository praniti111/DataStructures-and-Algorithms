//5. Remove Primes -remove prime numbers from the given ArrayList and return the updated ArrayList
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
	
		for(int i = al.size()-1;i>=0;i--)// start from right to left to avoid skipping elements, as if we start from first and the first ele is removed(when prime) then the arrlist shifts to left
		{
			if(isPrime(al.get(i)))
			{
				al.remove(i);
				
			}
    }
	}

	public static boolean isPrime(int x)
	{
		for(int i = 2;i*i<=x;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
 
