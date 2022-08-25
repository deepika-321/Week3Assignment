package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	int[] a={3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
	List<Integer> list1=new ArrayList<Integer>();
	List<Integer> list2=new ArrayList<Integer>();
	for(Integer integer:a) {
		list1.add(integer);}
		for(Integer integer1:b) {
			list2.add(integer1);
		
	}

	System.out.println(list1);
	System.out.println(list2);
	List<Integer> list3=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++) {
	for(int j=0;j<b.length;j++) {
		if(a[i]==b[j]) {
   	   list3.add(a[i]);
	
		}
	}
	}
	System.out.println("Common number is " + list3 );
}
}
