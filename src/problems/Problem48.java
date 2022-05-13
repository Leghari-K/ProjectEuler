// Problem: 48
// Status: Done
// Last Modified: Fri, 22 July, 2016
// Author: Abdullah Leghari


package problems;

import java.math.BigInteger;


public class Problem48 {
	public static BigInteger calcPow(int number)
	{
		BigInteger num = new BigInteger("1");
		
		for(int i = 1; i <= number; i++) {
			num = num.multiply(BigInteger.valueOf(number));
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(calcPow(i));
		}
		
		System.out.println(sum);

	}

}
