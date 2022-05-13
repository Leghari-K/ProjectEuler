// Problem: 30
// Status: Done
// Last Modified: Sat, 4 Jan, 2017
// Author: Abdullah Leghari


package problems;

public class Problem30 {
	
	public static Long calc4thPow(Long num) {
		Long sum = 0L;
		Long number = num;
		Long temp = 0L;
		
		while (number > 0) {
			temp = number % 10;
			sum += temp * temp * temp * temp * temp;
			number = number / 10;
		}
		return sum;	
	}

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		Long totalSum = 0L;		
		Long a = 1L;
		System.out.println(calc4thPow(a));
		
		
		for(long i = 2; i < 1000000; i++)
		{
			if(calc4thPow(i) == i)
			{
				
				totalSum += i;
				System.out.println(i + " , " + totalSum);
			}
		}
		
		System.out.println(totalSum);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
