package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionFindIntersection {

	public static void main(String[] args) {
		// create a list
		List<Integer> arr = new ArrayList<Integer>();
		//add value to the list
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		//create another list
		List<Integer> arr1 = new ArrayList<Integer>();
		//add values
		arr1.add(1);
		arr1.add(2);
		arr1.add(8);
		arr1.add(4);
		arr1.add(9);
		arr1.add(7);
		int arrsize = arr.size();
		int arr1size = arr1.size();
		System.out.println(arrsize);
		System.out.println(arr1size);
		
		arr.retainAll(arr1);
		System.out.println(arr);
		
		
	}

}
