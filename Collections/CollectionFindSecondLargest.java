package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionFindSecondLargest {

	public static void main(String[] args) {
		// create the set
		List<Integer> set = new ArrayList<Integer>();
		//add the values
		set.add(3);
		set.add(2);
		set.add(11);
		set.add(4);
		set.add(6);
		set.add(7);
		System.out.println(set);
		//Sort by using collections
		Collections.sort(set);
		System.out.println(set);
		//get the size of the collection
		int total = set.size();
		//find the second largest number
		Integer integer = set.get(total-2);
		System.out.println(integer+" is the second largest numbers");
		

	}

}
