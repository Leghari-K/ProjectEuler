// Problem: 20
// Status: Done
// Last Modified: Mon, 18 July, 2016
// Author: Abdullah Leghari

package problems;

import java.math.*;

public class Problem20 {
	public static BigInteger getFactorial(int num) {
		BigInteger result = new BigInteger("1");
				
		for(Integer i = 1; i <= num; i++) {
			
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		
		BigInteger val = getFactorial(100);
		String str = val.toString();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue((str.charAt(i)));
		}
		
		System.out.println(sum);
		
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
