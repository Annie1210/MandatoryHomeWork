package ReDo;

import org.junit.Test;

import junit.framework.Assert;

public class ClaimbingStairs {
	@Test
	public void test1() {
		int n=4;
		int expected = 5;
		int actual = findWays(n);
		Assert.assertEquals(expected, actual);
	}

	public int findWays(int n) {
		int a=0,b=1;//0 1 1 2 3 5
		int counter = 0;
		
		if(n==1) return 1;
		while(counter<n) {
			int c = a+b;
			a=b;
			b=c;
			counter++;
			
		}
		return counter;
	}
	 

}
