package SDET_Programs;
/*
 * 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
 * 
 * Psuedocode : 
 * 1. Get the input number
 * 2 iterate using whil loop till the condition n>0
 * 2. apply num modulo 10 to get the each digit of the given number-> 153%10 ->3
 * 3. apply num/10 to get the rest of the unprocessed digits-> 15
 * 4. store the logic of multiplying each digit with 3*3*3 in as temp = temp + (value returned from 3rd step)
 * 5. after the loop end, check if the temp value is also same as the act number
 *
 * 
 *
 */

import org.junit.Test;

import junit.framework.Assert;

public class ArmstrongNumber {
	@Test
	public void test1() {
		int n = 153;
		boolean output = true;
		boolean actOutput = findArmstrong(n);
		Assert.assertEquals(output, actOutput);
	}


	public boolean findArmstrong(int n) {
		
		int x=n;
		String digits = String.valueOf(n);
		int len = digits.length();
	
		int temp = 0, n1=0;
		while(n>0) {
			n1 = n%10; //153 %10 = 3 //15%10=5 //1%10 = 1
			temp = temp + (n1*n1*n1); // 27+15+1
			n = n/10; // 153/10 = 15 //15/10 = 1/10 = 0
			
		}
		if(temp==x) return true;
		else return false;
	}
	
	

}
