package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] strarray = test.toCharArray();
		System.out.println(strarray);
		for(int i=0; i<strarray.length; i++)
		{
			if(strarray[i]>=65 && strarray[i]<=90 || strarray[i]>=97 && strarray[i]<=122)
			{
				letter++;
			}
			else if(strarray[i] == 32)
			{
				space++;
			}
			else if(strarray[i]>=48 && strarray[i]<=57)
			{
				num++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
