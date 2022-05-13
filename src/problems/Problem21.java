// Problem: 21
// Status: Done
// Last Modified: Fri, 25 Nov, 2016
// Author: Abdullah Leghari

package problems;

public class Problem21 {

	public static void main(String[] args) {
		int t1 = 0;
		int t2 = 0;
		int sum = 0;
		
		for(int i = 1; i<= 10000; i++) {
			t1 = d(i);
			t2 = d(t1);
			
			if(t2 == i && t1 != t2)
			{
				System.out.println(t1 + " , " + t2);
				sum += t1;
			}
		}
		System.out.println(sum);

	}
	
	static int d(int n) {
		int sum = 0;
		if (n == 1)
			sum = 1;
		else
		{
			for(int i = 1; i <= n/2 + 1; i++) {
				if(n % i == 0)
					sum = sum + i;
			}
		}
		return sum;
	}

}
