package ReDo;
/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Pseudocode : 
1. find the max length of the given array
2. create a new array with the max len - newArr
3. set the array value as Maximum Integer value
4. Iterate throught the nums1 and nums 2 array to get the common values
	a) if arr[i] == arr[j] ->if(newArr[i]==arr[i]),count ++; newArr[x] = arr[i],x++
	
 */
import org.junit.Test;
import org.testng.Assert;

public class IntersectionOfArrays {
	
	@Test
	public void test1() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int output = 2;
		int[] result = findIntersection(nums1,nums2);
		Assert.assertEquals(output, result);
	}

	public int[] findIntersection(int[] nums1, int[] nums2) {
		
		int nums1Len = nums1.length;
		int nums2Len = nums2.length;
		int maxLen = 0, x=0;
		if(nums1Len > nums2Len) maxLen = nums1Len;
		if(nums2Len > nums1Len) maxLen = nums2Len;
		
		int arr[] = new int[maxLen];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i<nums1Len;i++) {
			for(int j=0;j<nums2Len;j++) {
				if(nums1[i]==nums2[j]) {
					int count =0;
					for(int k=0;k<arr.length;k++) {
						if(arr[k]==nums1[i]) {
							count++;
						}
					}
						if(count==0) {
							arr[x] =nums1[i];
							x++;
						}
				}
			}
		}
		
		int[] nums4 = new int[x];
		for(int i=0;i<nums4.length;i++) {
			nums4[i] = arr[i];		
		}
	
		return nums4;
	}

}
