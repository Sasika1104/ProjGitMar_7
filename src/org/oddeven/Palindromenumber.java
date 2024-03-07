package org.oddeven;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in) ;
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int org_num=num;
		int rev=0;
		while (num!=0) 
		{
			rev=rev*10 + num%10; //=====logic for Number Reversal
			num=num/10;
			
		}
		System.out.println(rev);
		if(org_num==rev)
		{
			System.out.println(org_num+ " is a palidrome");
			
		}
		else
		{
			System.out.println(org_num+ " is not a palidrome");
		}
		
	}

}
