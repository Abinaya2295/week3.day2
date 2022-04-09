package week3.day2;

public class StringCharOccurrence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		int count = 0;
		char searchLetter = 'e';
		char[] strarray = str.toCharArray();
		int length = strarray.length;
		for(int i=0; i<length; i++)
		{
			if(str.charAt(i) == searchLetter)
			{
				count++;
			}
		}
		System.out.println("Number of occurrences of a char "+searchLetter+" is : "+count);

	}

}
