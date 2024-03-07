package org.oddeven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Findingsmallestnum {

	Integer[] numarray= {7,5,9,6,2};
	
	public void smallnum() {
		int[] numarray= {7,5,9,6,2};
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < numarray.length; i++)
		{
			if(numarray[i]<small)
			{
				small=numarray[i];
			}
		}
		System.out.println("The smallest number is "+ small);
	}
	public void arraybiggestnumber() {
		Arrays.sort(numarray);
		System.out.println(numarray[4]);
	}
	
	public void smallnum1() {
		List<Integer> asList = Arrays.asList(numarray);
		Collections.sort(asList);
		Integer small = asList.get(0);
		System.out.println(small);
	}
	
	
	
	public static void main(String[] args) {
		
		Findingsmallestnum fsn=new Findingsmallestnum();
		fsn.smallnum();
		fsn.arraybiggestnumber();
		fsn.smallnum1();
	}

}
