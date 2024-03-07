package org.oddeven;

import java.util.Scanner;

public class Countofnumbers {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int count=0;
		while(num>0)
		{
			num=num/10; //12345==> (12345/10=1234) (1234/10=123) (123/10=12) (12/10=1) (1/10=0) 
			count++;   //0==> 1  2 3 4 === 5
			
		}
		
		System.out.println("Print the count of numbers "+ count);
	}

}
