// Problem: 24
// Status: Done
// Last Modified: Fri, 03 Feb, 2017
// Author: Abdullah Leghari

package problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import org.apache.commons.collections4.iterators.PermutationIterator;

public class Problem24 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		long t0, t1; 
		t0 = System.currentTimeMillis();
		
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<String> finalResult = new ArrayList<String>();
		
				

		PermutationIterator perm = new PermutationIterator(list);
		
		while(perm.hasNext())
		{
			finalResult.add(perm.next().toString());
			
			//System.out.println(perm.next());
		}
		
		Collections.sort(finalResult);

		System.out.println(finalResult.get(1000000 - 1));
			
		t1 = System.currentTimeMillis();
		if((t1 - t0) > 1000)
			System.out.println("Time = " + (t1 - t0)/1000 + " s");
		else
			System.out.println("Time = " + (t1 - t0) + "ms");
		
		

	}

}
