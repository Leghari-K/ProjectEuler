// Problem: 4
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem4 {

	public static boolean isPalindrome(int num) {
		String numStr = Integer.toString(num);
		boolean isPalin = false;
		StringBuilder str = new StringBuilder(numStr);
		
				
		if(str.reverse().toString().equals(numStr))
			isPalin = true;
		else
			isPalin = false;
		
		return isPalin;
	}
	
	
	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int max = 999;
		int largest = 0;
		
		for(int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				if(isPalindrome ( i * j) & (i*j) > largest)
				{
					largest = i * j;
				}
			}
		}
		
		System.out.println(largest);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms");
	}

}
