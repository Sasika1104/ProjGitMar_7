package org.oddeven;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	Scanner soe=new Scanner(System.in);
	System.out.println("Get the Number");
	int num=soe.nextInt();
	if (num%2==0) 
	{
		System.out.println("The given number is Even");
	}
	else {
		System.out.println("The Given number is Odd");
	}
	}
	
	}


