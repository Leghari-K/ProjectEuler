// Problem: 14
// Status: Done
// Last Modified: Wed, 20 July, 2016
// Author: Abdullah Leghari

package problems;

public class Problem14 {
	public static long makeChain(long num) {
		
		long cur = num;
		long chain = 1;
		while (cur !=1 ) {
			if(cur % 2 == 0) {
				cur = cur / 2;
				chain ++;
			}
			else {
				cur = cur * 3 +1;
				chain ++;
			}
		}
		
		return chain;
	}

	public static void main(String[] args) {
		long max = 0;
		long num = 0;
		long temp = 0;
		
		for(long i = 1; i < 1000000; i++) {
			temp = makeChain (i);
			if(temp > max) {
				max = temp;
				num = i;
			}
			System.out.println(i + " , " + temp + " , " + max);
		}
		System.out.println("Final-----\n");
		System.out.println(num);
		System.out.println(max);
		

	}

}
