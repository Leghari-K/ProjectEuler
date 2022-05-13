// Problem: 56
// Status: ToDo
// Last Modified: Sat, 04 Jan, 2017
// Author: Abdullah Leghari


package problems;

//import java.math.BigInteger;

public class Problem56 {
	/*public static BigInteger getSum(BigInteger num){
		BigInteger sum = new BigInteger("0");;
		long number = num;
		long temp = 0;
		
		while (number > 0) {
			temp = number % 10;
			sum += temp * temp;
			number = number / 10;
		}
		
		return sum;
		
	}*/

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		/*BigInteger num = new BigInteger("0");
		
		num.add("1000000000000000000000000000000000000");
		//System.out.println(getSum(1000000000000000000000000000000000000L));
		*/
		t1 = System.currentTimeMillis();
		if((t1 - t0) > 1000)
			System.out.println("Time = " + (t1 - t0)/1000 + " s");
		else
			System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
