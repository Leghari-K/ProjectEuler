// Problem: 16
// Status: Done
// Last Modified: Mon, 18 July, 2016
// Author: Abdullah Leghari


package problems;
import java.math.*;

public class Problem16 {

	public static void main(String[] args) {
		BigInteger pow = new BigInteger("1");
		
		for(int i = 1; i <= 1000; i++) {
			
			pow = pow.multiply(BigInteger.valueOf(2));
		}
		
		
		int sum = 0;
		String str = pow.toString();
		
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue((str.charAt(i)));
		}
		
		System.out.println(sum);
		
		System.out.println(pow);

	}

}
