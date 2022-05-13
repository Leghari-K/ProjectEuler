// Problem: 12
// Status: Done
// Last Modified: Sun, 17 July, 2016
// Author: Abdullah Leghari

package problems;

public class Problem12 {
	public static int getFactors(long num) {
		if (num == 1)
			return 1;
		
		int count = 0;
		
		for(long i = 1; i <= num/2+1; i++) {
			if(num % i == 0)
				count++;
		}
		
		return count + 1;
	}

	public static void main(String[] args) {
		long numTriangle = 1;
		long posTriangle = 1;
		
		while(getFactors(numTriangle) <= 500) {
			System.out.println(posTriangle + " " + numTriangle + " " + getFactors(numTriangle));
			posTriangle++;
			numTriangle = numTriangle + posTriangle;
		}
		
		System.out.println(numTriangle);

	}
}
