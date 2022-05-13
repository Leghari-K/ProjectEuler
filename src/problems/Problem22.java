// Problem: 22
// Status: Done
// Last Modified: Wed, 20 July, 2016
// Author: Abdullah Leghari

package problems;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {
	
	public static int getScore (String name) {
		int score = 0;
		
		for(int i =0; i < name.length(); i++) {
			score += name.charAt(i) - 64;
		}
		return score;
	}
	
	
	public static void main(String[] args) {
		long score = 0;
		
		File file = new File ("data/p022_names.txt");
		String names = "";
		
		try {
			Scanner input = new Scanner(file);
			names = input.nextLine();
			input.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found...");
			e.printStackTrace();
		}
		
		String[] namesArray = names.split(",");
		Arrays.sort(namesArray);
		
		for(int i = 0; i < namesArray.length; i++)
		{
			score += ((i+ 1) * getScore(namesArray[i]));
		}
		
		System.out.println(score);
	}
}