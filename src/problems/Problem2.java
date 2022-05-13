// Problem: 2
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari

package problems;

public class Problem2 {

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int term1 = 1;
		int term2 = 2;
		int temp = 0;
		int sum = term2;
		
		while(term2 < 4000000) {
			temp = term1;
			term1 = term2;
			term2 = term1 + temp;
			if(term2 < 4000000) {
				if(term2 % 2 == 0){
					sum+= term2;
				}
			}	
			
		}
		
		System.out.println (sum);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms"); 
		

	}

}
