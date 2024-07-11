package org.jn.aameen.leetcode.array;

public class SearchInsertPosition {
	
	
	    public int searchInsert(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	      
	        return left;
	    }

	    public static void main(String[] args) {
	        SearchInsertPosition solution = new SearchInsertPosition();
	        
	        // Test case 1
	        int[] nums1 = {1, 3, 5, 6};
	        int target1 = 5;
	        System.out.println("Output: " + solution.searchInsert(nums1, target1)); // Expected output: 2

	        // Test case 2
	        int[] nums2 = {1, 3, 5, 6};
	        int target2 = 2;
	        System.out.println("Output: " + solution.searchInsert(nums2, target2)); // Expected output: 1

	        // Test case 3
	        int[] nums3 = {1, 3, 5, 6};
	        int target3 = 7;
	        System.out.println("Output: " + solution.searchInsert(nums3, target3)); // Expected output: 4

	        // Test case 4
	        int[] nums4 = {1, 3, 5, 6};
	        int target4 = 0;
	        System.out.println("Output: " + solution.searchInsert(nums4, target4)); // Expected output: 0
	    }
	}


