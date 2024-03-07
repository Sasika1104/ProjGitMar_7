package org.oddeven;

public class Reverseanumber {
	
	public void Revnum() 
	{ 
		int givennum=209;
		int reversed=0;
		
		/*			***Reverse num formulae***
		 * reversed=reversednum*10					// ==> 0*10 =" 0 "
		 * reversednum=reversednum + givennum %10	// ==>(209%10= 9(reminder))==>0+9=9
		 * givennum=givennum/10						// ==>209/10 = " 20 "
		 * 
		 */
		while(givennum !=0) {
			
			reversed=reversed*10;
			reversed=reversed+givennum%10;
			givennum=givennum/10;
			//System.out.println(reversed);
		}
		System.out.println(reversed);
			}

	public static void main(String[] args) {

		Reverseanumber rvenum=new Reverseanumber();
		rvenum.Revnum();
	}

}
