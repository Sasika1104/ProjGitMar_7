package org.oddeven;

import java.util.Scanner;

public class Evencount {

	public static void main(String[] args) {

		
	Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number for Even");
	int	num=s.nextInt();
	
	int count=0;
	
		for(int i=1;i<=num;i++)
		{
		{
			if((i%2)==0)
			{
				count++;
			}
			
		}
		
		
		}
		System.out.println("the Given Even Numbers total count is " +count);

			}
	}

