// Problem: 9
// Status: Done
// Last Modified: Sun, 17 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem9 {

	public static void main(String[] args) {
		
		for(int c = 1; c < 1000; c++) {
			for(int b = 1; b < c; b++) {
				for(int a = 1; a < b; a++) {
					if((a + b + c) == 1000 && (a < b) && (b < c) && ((a * a )+ (b * b) == (c * c)))
						System.out.println(a+ " * "  + b + " * " + c + " = " + a * b * c);
						
				}
			}
		}

	}

}
