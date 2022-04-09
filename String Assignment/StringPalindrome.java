package week3.day2;

public class StringPalindrome {

	public static void main(String[] args) {
		// Declare String
		String str = "madam";
		System.out.println(str);
		String rev = "";
		//iterate the string with reverse order
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
	}

}
