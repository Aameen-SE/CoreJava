package org.jn.aameen.leetcode.array;

public class RemoveDuplicates {
	
	
	    public int removeDuplicates(int[] nums) {
	       
	        if (nums.length == 0) {
	            return 0;
	        }

	        
	        int slow = 0;

	       
	        for (int fast = 1; fast < nums.length; fast++) {
	           
	            if (nums[fast] != nums[slow]) {
	                
	                slow++;
	                nums[slow] = nums[fast];
	            }
	        }

	       
	        return slow + 1;
	    }

	    public static void main(String[] args) {
	        RemoveDuplicates solution = new RemoveDuplicates();
	        
	       
	        int[] nums = {1, 1, 2};
	        int k = solution.removeDuplicates(nums);

	        System.out.println("Number of unique elements: " + k);
	        System.out.print("Array with unique elements: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(nums[i] + " ");
	        }
	        
	    }
	}



