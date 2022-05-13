// Problem: 25
// Status: Done
// Last Modified: Fri, 22 July, 2016
// Author: Abdullah Leghari


package problems;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		BigInteger term1 = new BigInteger("1");
		BigInteger term2 = new BigInteger("2");
		BigInteger temp = new BigInteger("0");
		BigInteger sum = new BigInteger ("2");
		
		while(term2.toString().length() < 1000) {
			temp = term1;
			term1 = term2;
			
			term2 = term1.add(temp);
			sum = sum.add(BigInteger.valueOf(1));
		} 
		
		System.out.println(term2);
		System.out.println (sum.add(BigInteger.valueOf(1)));

	}

}
