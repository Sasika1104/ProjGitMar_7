package org.oddeven;

import java.util.Scanner;

public class Oddsum {

	public static void main(String[] args) {
		int oddsum=0,num;
		Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
  
  num=s.nextInt();
 
  for (int i=1; i<=num; i++)
  {
	
	  if(i%2 !=0)
		  
	  {
		  System.out.println("Print the Odd numbers  ");
		  System.out.println(i);
		  oddsum=oddsum+i;
		 
	  }
	
  }
  System.out.println("The odd numbers sum is  " +oddsum );
	}

}
