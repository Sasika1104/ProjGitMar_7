package org.oddeven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverseastring {

	public void Strbuff() {
		String given="Sidd";
		StringBuffer sb=new StringBuffer();
		sb.append(given);
		System.out.println(sb.reverse());
	}
	public static String given;

	public void Characterarray() {

		given="Sasi";
		char[] charArray = given.toCharArray();
		String reversed="";
		for (int i=charArray.length-1; i>=0; i--) {

			reversed=reversed+charArray[i];

		}
		System.out.println(reversed);	}

	public void Collectionarray() {
		given= "Siddu";
		char[] charArray = given.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for (Character character : charArray) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator iterator=list.listIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());	
		}
	}
		
	public void stringlength() {
		given="Greenstechnology";
		System.out.println(given.length());
		
		char[] charArray = given.toCharArray();
		int length= charArray.length;
	
		/*for (char c : charArray) {
			length++;
		}*/
		System.out.println("The given String length is " + length);
		
	}
	public static void main(String[] args) 
	{
		Reverseastring ras=new Reverseastring();
		ras.Strbuff();
		ras.Characterarray();
		ras.Collectionarray();
		ras.stringlength();
	}

}
