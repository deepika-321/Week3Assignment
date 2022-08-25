package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(11);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(6);
		set.add(6);
		
		System.out.println(set);
		
		
		List<Integer> list=new ArrayList<Integer>(set);
		int size=list.size();
		System.out.println("Size is: "+ size);
System.out.println("Second Largest element is: "+ list.get(size-2));
		
}
	
			
}
	
		
	
	
	
	

