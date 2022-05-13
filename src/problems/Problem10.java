// Problem: 10
// Status: Done
// Last Modified: Sun, 17 July, 2016
// Author: Abdullah Leghari


package problems;

import org.apache.commons.math3.primes.*;

public class Problem10 {

	public static void main(String[] args) {
		
		long sum = 0;
		int lastPrime = Primes.nextPrime(0);
		
		while(lastPrime < 2000000) {
			//System.out.println(lastPrime);
			sum += lastPrime;
			lastPrime = Primes.nextPrime(lastPrime+1);
		}
		
		System.out.println(sum);

	}

}
