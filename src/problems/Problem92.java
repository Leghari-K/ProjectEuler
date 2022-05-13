// Problem: 92
// Status: Done
// Last Modified: Fri, 03 Feb, 2017
// Author: Abdullah Leghari

package problems;

public class Problem92 {
	public static int getSum(int num){
		int sum = 0;
		int number = num;
		int temp = 0;
		
		while (number > 0) {
			temp = number % 10;
			sum += temp * temp;
			number = number / 10;
		}
		
		return sum;
		
	}
	
	public static int getChain(int number) {
		int chain = number;
		boolean loop = true;
		
		while(loop)
		{
			chain = getSum(chain);
			
			if(chain == 1 || chain == 89)
			{
				loop = false;
			}
			//System.out.println(chain);
		}
		
		return chain;
	}

	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		int eightyNines = 0;
		for(int loop = 1; loop < 10000000; loop++){
			if(getChain(loop) == 89)
			{
				eightyNines += 1;
			}
		}
		
		System.out.println(eightyNines);
		
		t1 = System.currentTimeMillis();
		System.out.println("Time = " + (t1 - t0) + " ms");

	}

}
