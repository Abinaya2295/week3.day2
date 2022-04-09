package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=list.get(0); i<list.size(); i++)
		{
			if(i != list.get(i-1))
			{
				System.out.println("The missing number is : "+ i);
				break;
			}
		}
		
	}

}
