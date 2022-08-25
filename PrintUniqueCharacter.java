package week3.day2;

import java.util.HashSet;
import java.util.Set;


public class PrintUniqueCharacter {
public static void main(String[] args) {
	String name = "Deepika";
	char[] ch = name.toCharArray();
	Set<Character> set= new HashSet<Character>();
	for (char c : ch) {
		if(set.contains(c)) {
			set.remove(c);
			
		}  
		else
	set.add(c);
}
	System.out.println(set);
}

}
