// Problem: 17
// Status: Done
// Last Modified: Wed, 20 July, 2016
// Author: Abdullah Leghari


package problems;

public class Problem17 {
	public static String getOneToTen (int num) {
		String wordStr = "";
		
		String oneToTen[] = {"one", "two", "three", "four", "five", "six", 
				  "seven", "eight","nine", "ten", "eleven", "twelve",
				  "thirteen", "fourteen", "fifteen", "sixteen","seventeen",
				  "eighteen", "nineteen"};
		
		wordStr += oneToTen[num -1];
		return wordStr;
	}
	
	public static String getTenToNn (int num) {
		String wordStr = "";
		
		String tenToNn[] = {"twenty","thirty","forty", "fifty", "sixty",
				"seventy", "eighty", "ninety"};
		
		if(num % 10 == 0)
			wordStr += tenToNn[ ((num/10) - 2) ];
		else {
			wordStr += tenToNn[ ((num/10) - 2) ];
			wordStr += getOneToTen( (num % 10) );
		}
		
		return wordStr;
	}
	
	public static int getLetters(int num) {

		
		
		
		String wordStr = "";
		
		if (num < 20) {
			wordStr += getOneToTen(num);
		} else if (num < 100) {
			wordStr += getTenToNn(num);
		} else if (num < 1000) {
			if(num % 100 == 0) {
				wordStr += getOneToTen(num / 100);
				wordStr += "hundred";
			}else
			{
				wordStr += getOneToTen(num / 100);
				wordStr += "hundredand";
				if (num % 100 < 20)
					wordStr += getOneToTen(num %100);
				else
				wordStr += getTenToNn(num%100);
				//System.out.println(num %100);
			}
				
		} else if (num == 1000) {
			wordStr += "onethousand";
		}
		
		//System.out.println(wordStr);
		return wordStr.length();
		
	}

	public static void main(String[] args) {
		int total = 0;
		
		
		//System.out.println(getLetters(111));
		
		
		for (int i = 1; i <=1000 ; i++) {
		total += getLetters(i);
		}
	
		System.out.println(total);
		
	
	}

}
