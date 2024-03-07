package org.oddeven;

import java.util.Scanner;

public class sumnumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;  //0+123%10=(0+3=3)  3+12%10=(3+2=5) (5+1%10=5+1=6)
			num=num/10;   //(123/10=12) (12/10=1) (1/10=0)
		}
 System.out.println("Print Sum of the numbers  " + sum);
	}

}
