// Problem: 3
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem3 {

	public static boolean isPrime(int num) {
		boolean prime = true;
		
		if (num == 1)
			prime = true;
		
		for(int i = 2; i <= num; i++) {
			if (num % 2 == 0)
				prime = false;
		}
		
		return prime;
	}
	
	public static boolean isPrime(long num) {
		boolean prime = true;
		
		if (num == 1)
			prime = true;
		
		for(long i = 2; i <= Math.sqrt(num); i++) {
			if (num % 2 == 0)
				prime = false;
		}
		
		return prime;
	}
	
	public static void main(String[] args) {
		long t0 = System.currentTimeMillis();
		
		long num = 600851475143L;
		long val = 1L;
		
		for(long i = 2; i<= num; i++) {
		
			if(isPrime(i))
				if(num%i == 0) {
					val = val * i;
					System.out.println(i + " , " + val);
					
				}
		if(val == num)
			break;
		}
		
		long t1 = System.currentTimeMillis();
		
		System.out.println("Time = " + ( t1 - t0));
	}
}


 