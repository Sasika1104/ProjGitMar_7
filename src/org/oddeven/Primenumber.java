package org.oddeven;

import java.util.Scanner;

public class Primenumber { // the logic is Natural number >1      2.which has only 2 factors 1 & itself

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
        int num=s.nextInt();
		int count=0;
	//	int num=12;
		if(num>1)
		{
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==2)
		{
			System.out.println("the number is prime number");
		}
		
			
		else {
		System.out.println("the number is not a prime number");	
		}
	}
	}
}
