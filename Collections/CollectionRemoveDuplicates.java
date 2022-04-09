package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		// create the list
		Set<String> list = new LinkedHashSet<String>();
		list.add("We");
		list.add("learn");
		list.add("java");
		list.add("basics");
		list.add("as");
		list.add("part");
		list.add("of");
		list.add("java");
		list.add("sessions");
		list.add("in");
		list.add("java");
		list.add("week1");
		
		for (String string : list) {
			System.out.print(string+" ");
		}
		
	}

}
