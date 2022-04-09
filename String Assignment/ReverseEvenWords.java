package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester";
		//split the words and have it in an array
		String[] splitarray = test.split(" ");
		for(int i=0; i<splitarray.length; i++)
		{
			String word = splitarray[i];
		//	System.out.println(word);
			if(i % 2 != 0)
			{
				String reverseword ="";
				for(int j=word.length()-1; j>=0; j--)
				{
					reverseword = reverseword + word.charAt(j);
				}
				System.out.print(reverseword +" ");
			}
			else
			{
				System.out.print(word+" ");
			}
		}

	}

}
