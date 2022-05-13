// Problem: 7
// Status: Done
// Last Modified: Sat, 16 July, 2016
// Author: Abdullah Leghari

package problems;
import org.apache.commons.math3.primes.*;

public class Problem7 {
	

	public static void main(String[] args) {
		
		
		int primes = 0;
		int num = 0;
		
		while(primes < 10001) {
			if(Primes.isPrime(num)) {
				System.out.println(num);
				primes++;
				num++;
			} else
				num++;
		}

	}

}
