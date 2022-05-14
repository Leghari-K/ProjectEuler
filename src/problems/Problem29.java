// Problem: 29
// Status: Done
// Last Modified: Sun, 15 May, 2022
// Author: Abdullah Leghari
// Time = 629 ms


package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;



public class Problem29 {
	
	static BigInteger bigPow(BigInteger base, BigInteger exponent) {
		  BigInteger result = BigInteger.ONE;
		  while (exponent.signum() > 0) {
		    if (exponent.testBit(0)) result = result.multiply(base);
		    base = base.multiply(base);
		    exponent = exponent.shiftRight(1);
		  }
		  return result;
		}

	
	
	public static void main(String[] args) {
		
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int aM = 100;
		int bM = 100;
				
		ArrayList<BigInteger> allTerms = new ArrayList<BigInteger>();
		
		for(int a = 2; a<=aM; a++) {
			for(int b = 2; b<=bM; b++) {
				BigInteger term;
				BigInteger aVal = BigInteger.valueOf(a);
							
				
				term = aVal.pow(b);
				
				if(!allTerms.contains(term))
					allTerms.add(term);

			}		
			
		}
		
		
		allTerms.sort(Comparator.naturalOrder());
		
		for(BigInteger term:allTerms) {
			//System.out.print(term + " ");
		}
		
		System.out.println(allTerms.size());
		
			
		t1 = System.currentTimeMillis();
		System.out.println("\nTime = " + (t1 - t0) + " ms");
	}

}