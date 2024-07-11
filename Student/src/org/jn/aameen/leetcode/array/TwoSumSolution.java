package org.jn.aameen.leetcode.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumSolution {

	  public static void main(String[] args) {
		  
	        TwoSumSolution solution = new TwoSumSolution();
	        
	       
	        int[] nums = {2, 7, 11, 15};
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the target :");
	        int target = sc.nextInt();
	        
	       
	        int[] result = solution.twoSum(nums, target);
	        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	    }
	  
	  public int[] twoSum(int[] nums, int target) {
	       
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i]; 
	            
	           
	            if (map.containsKey(complement)) {
	               
	                return new int[] { map.get(complement), i };
	            }
	            
	          
	            map.put(nums[i], i);
	        }
	        
	        
	        return new int[] {};
	    }
	  
	  
}
