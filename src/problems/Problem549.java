// Problem: 549
// Status: ToDo
// Last Modified: Tue, 19 July, 2016
// Author: Abdullah Leghari

package problems;

import java.math.BigInteger;

public class Problem549 {
	public static BigInteger getFactorial(int num) {
		BigInteger result = new BigInteger("1");
				
		for(Integer i = 1; i <= num; i++) {
			
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}

	public static void main(String[] args) {
		BigInteger res = new BigInteger("1");
		
		res = res.add(getFactorial(2012));
		int sum = 0;
		for(int i =2 ; i<=100; i++)
			sum += i;
		
		System.out.println(sum);
		
		/*if(res.remainder(BigInteger.valueOf(sum)) == 0)
		{
			
		}*/
		

	}

}
