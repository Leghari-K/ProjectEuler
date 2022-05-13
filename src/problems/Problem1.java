// Problem: 1
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem1 {

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int max = 1000;
		int sum = 0;
		
		for(int i = 1; i < max; i++) {
			if(i % 3 == 0 | i % 5 == 0) {
				sum += i;
			}
		} 
		
		System.out.println(sum);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms"); 

	}

}
