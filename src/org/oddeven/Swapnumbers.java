package org.oddeven;

public class Swapnumbers {

	public void withusingthird() 
	{
		int mysal=20;
		int Superior=50;
      	System.out.println("Before swap My sal is " +mysal +" my Superior sal is " + Superior);
		 // *******this is swap concept******
      	int temp=mysal;
      
		mysal=Superior;
	
		Superior=temp;
		
		System.out.println("Before swap My sal is " +mysal +" my Superior sal is " + Superior);
		}
	public void withoutusingthird() {
		/*
		 * 				Formula
		 * First=first-second; second=first+second; first=second-first
		 * 
		 * First=first*second; second=first/second; first=first/second
		 * for multiply formula we shouldn't use zero's
		 */
		
		int first=20, second=10;
		System.out.println("Before swap first " +first +" my second is " + second);
		
		first=first-second; // 20-10= "10"
		second=first+second; // 10+10= "20"
		first=second-first; //  20-10= "10"
		System.out.println("After swap first " +first +" my second is " + second);
		
		
		int first1=50, second1=40;
		System.out.println("Before swap first " +first1 +" my second is " + second1);
		
		first1=first1*second1; // 50*40= "200"
		second1=first1/second1; // 200/40= "50"
		first1=first1/second1; //  200/50= "40"
		System.out.println("After swap first " +first1 +" my second is " + second1);
	}
	
	public static void main(String[] args) {

		Swapnumbers snum=new Swapnumbers();
		snum.withusingthird();
		snum.withoutusingthird();
	}

}
