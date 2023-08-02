package ReDo;

import org.junit.Test;
import org.testng.Assert;

/*
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Pseudocode :
1. To get the maximum candytype -> n=n/2
2.if n is 1 , return 1
3. if n is more than 1, iterate using for loop(i & j) to get the unique occurrence of the number
4. if the unique occurrence count is greater than n/2, return n/2
5. else return unique occurrence count
 */

public class AliceandCadies {
	
	@Test
	public void test1() {
		int[] candyType = {1,1,2,3};
		int expCount = 2;
		int actCount = findMaxType(candyType);
		Assert.assertEquals(actCount, expCount);
		
	}

	public int findMaxType(int[] candyType) {
		
		int maxType = candyType.length/2;
		int count=0;
		if(maxType==1) return 1;
		
		for(int i=0;i<candyType.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<candyType.length;j++) {
				if(candyType[i]==candyType[j]) {
					flag = true;
					break;
				}				
			}
			if(flag==false) {
				count++;		
			}
		}

		if(count>maxType) return maxType;
		else return count;
	}

}
