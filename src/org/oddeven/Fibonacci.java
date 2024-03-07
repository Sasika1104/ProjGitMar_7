package org.oddeven;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number for fibonacci upto");
		int num=s.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1+" "+n2);
		for (int i=1;i<=num;i++)
	{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println("The Fibonacci series " +n3);

	}
			}

}
