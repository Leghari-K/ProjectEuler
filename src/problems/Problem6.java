// Problem: 6
// Status: Done
// Last Modified: Fri, 15 July, 2016
// Author: Abdullah Leghari

package problems;

public class Problem6 {

	public static void main(String[] args) {
		int sumOfSquare = 0;
		int squareOfSum = 0;
		
		for(int i = 1; i<=100; i++) {
			sumOfSquare += i * i;
			squareOfSum += i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		
		System.out.println(sumOfSquare);
		System.out.println(squareOfSum);
		System.out.println(squareOfSum - sumOfSquare);
	}
}
