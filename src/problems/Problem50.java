// Problem: 50
// Status: ToDo
// Last Modified: Thu, 11 Mar, 2021
// Author: Abdullah Leghari

package problems;
import java.util.*;

import org.apache.commons.math3.primes.*;

public class Problem50 {

	public static void main(String[] args) {
		
		int primeNum = 0;
		int curPrime = 0;
		int curSum = 0;
		int max = 100;
		
		List<Integer> list = new ArrayList<>();
		
		while(curSum < max) {
			curPrime = Primes.nextPrime(curPrime);
			list.add(curPrime);
			curSum += curPrime;
			
			curPrime++;
		}
		
		int curPrime1 = 0;
		int termCount = 0;
		int lastTermCount = 0;
		
		for(int i = list.size() - 1; i >= 0; i--)
		{
			System.out.print(list.get(i) + " " );
			curPrime1+= list.get(i);
			termCount++;
			
			if(Primes.isPrime(curPrime1) && (termCount > lastTermCount))
			{
				primeNum = curPrime1;
				lastTermCount = termCount;
			}
		}
		System.out.println();
		System.out.println(primeNum + " - " + lastTermCount);
		System.out.println(primeNum + " - " + curSum);

	}

}
