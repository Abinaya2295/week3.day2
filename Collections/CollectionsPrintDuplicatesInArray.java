package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsPrintDuplicatesInArray {

	public static void main(String[] args) {
		// create a list
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		System.out.println(list);
		int size = list.size();
		for(int i=0; i<size-1; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(list.get(i) == list.get(j))
				{
					System.out.println(list.get(i));
				}
			}
		}

	}

}
