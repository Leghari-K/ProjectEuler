// Problem: 15
// Status: ToDo
// Last Modified: Sun, 16 Jul, 2023
// Author: Abdullah Leghari


package problems;

public class Problem15 {

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int grid = 20;
		int count = 0;
		
		
		for(int i = 1; i <= grid; i++) {
			for(int j = 0; j <= grid; j++) {

				 count= count +1;
								
			}
		}
		
		System.out.println(count);
		
		t1 = System.currentTimeMillis();
		if((t1 - t0) > 1000)
			System.out.println("Time = " + (t1 - t0)/1000 + " s");
		else
			System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
