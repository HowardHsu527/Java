package com.shihao;

import com.shihao.algorithm.MergeSortedArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MergeSortedArray array = new MergeSortedArray();
        int[] nums1 = new int[] {1,3,5,6,7,0,0,0,0,0};
        int[] nums2 = new int[] {2,5,6,8,10};
        array.Merge(nums1, 5, nums2, 5);
    }

}
