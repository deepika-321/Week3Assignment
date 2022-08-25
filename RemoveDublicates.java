package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {
	
	public static void main(String[] args) {
		String name="PayPal India";
		char[] ch = name.toCharArray();
		
	Set<Character> charSet=new HashSet<Character>();
	Set<Character> dupCharSet=new HashSet<Character>();
	
for(Character character:ch) {
	if(charSet.contains(character)) {
		dupCharSet.add(character);
		
	}
	
	else
	{
	charSet.add(character);
	
	}}
	for (Character remove : dupCharSet) {
		if(charSet.contains(remove))
		{
			charSet.remove(remove);
		}
	}
	for (Character print : charSet) {
		if(Character.isLetter(print))
		System.out.println(print);
	}
		
	}
	}
