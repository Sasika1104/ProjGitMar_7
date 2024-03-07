package org.oddeven;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int num=s.nextInt();
		int result = 1;
		
		for(int i=1;i<=num;i++)
		{
		result= result*i;
		
		}
		System.out.println("The factorial number of "+ num + " is "+result);
	}

}

