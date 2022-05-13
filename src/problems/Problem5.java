// Problem: 5
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem5 {

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int num = 1;
		int max = 20;
				
		int i = 1;
		
		while (i <= max) {
			if(num % i != 0) {
				i = 1;
				num++;
			} else
				i++;
		}
		
		System.out.println(num);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms");
	}

}