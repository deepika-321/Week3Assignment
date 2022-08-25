package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> set= new TreeSet<Integer>();
		for (Integer integer : data) {
		set.add(integer);
		
}
		System.out.println(set);
		
	for(int i=0;i<data.length;i++)
	{
    for(int j=i+1;j<data.length;j++)
    {
    	if(data[i]==data[j]) {
    		System.out.println("Duplicate Data: "+data[i]);
    	}
    }
	}
}
}