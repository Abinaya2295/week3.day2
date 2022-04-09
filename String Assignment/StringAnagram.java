package week3.day2;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// Declare a String 
		String text1 = "stops";
		
		//Declare another String
		String text2 = "potss";
		
		//Check length of the strings are same then (Use A Condition)
		int length1 = text1.length();
		System.out.println(length1);
		int length2 = text2.length();
		System.out.println(length2);
		if(length1 == length2)
		{
			System.out.println("Length matches the text 1 and text 2");
		}
		//Convert both Strings in to characters
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
		
		//Sort Both the arrays
		Arrays.sort(char1);
		Arrays.sort(char2);
		System.out.println(char1);
		System.out.println(char2);
		
		//Check both the arrays has same value
		if(Arrays.equals(char1, char2))
		{
			System.out.println("Array having same value");
		}
		else
		{
			System.out.println("Array having different value");
		}
	}

}
