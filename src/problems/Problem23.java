// Problem: 23
// Status: ToDo
// Last Modified: Fri, 03 Jan, 2017
// Author: Abdullah Leghari

package problems;

public class Problem23 {

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
				
		t1 = System.currentTimeMillis();
		if((t1 - t0) > 1000)
			System.out.println("Time = " + (t1 - t0)/1000 + " s");
		else
			System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
