package week3.day2;


import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(5);
		set.add(8);
		set.add(9);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.size());
		
		for(int i=0;i<set.size();i++) {
			if(set.contains(i+1)) 
			{

			}
			else{
			System.out.println("The missing number is: "+(i+1));}
		}
		
		
	}

}
