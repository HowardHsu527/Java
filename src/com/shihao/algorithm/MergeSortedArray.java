package com.shihao.algorithm;

/*
*Created by ZimingC on 2/18/17.
*
*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
*Note:
*You may assume that nums1 has enough space (size that is greater or equal to m + n)
*to hold additional elements from nums2.
*The number of elements initialized in nums1 and nums2 are m and n respectively.
**/
public class MergeSortedArray {

	/*
	* Since the arrays already sorted. So we just need iterate from the largest to the smallest.
	* Thus can avoid collisions between two array.
	* */
	public void Merge(int[] nums1, int m, int[] nums2, int n) {
		while(n > 0) {
			if(m < 1) nums1[--n] = nums2[n];
			else if(nums1[m-1] >= nums2[n-1]) {
				nums1[--m + n] = nums1[m];
			}
			else {
				nums1[--n + m] = nums2[n];
			}
		}
	}
}
