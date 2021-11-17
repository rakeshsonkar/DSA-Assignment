package assignment3;

import java.util.Scanner;

public class MumunRotoed {
	static public int findMin(int[] nums) {
		 if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n=nums.length;
        int start=0;
        int end=nums.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        int next=(mid+1)%n;
        int pre=(mid+n-1)%n;
        if(nums[mid]<=nums[pre]&&nums[mid]<=nums[pre]){
            return nums[mid];
        }
         if(nums[mid]>=nums[start] && nums[mid]<=nums[end])
         { 
             return nums[start];
         }
        if(nums[start]<=nums[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();

	        int[]nums = new int[n];
	        for(int i = 0 ; i < n; i++) {
	            nums[i] = scn.nextInt();
	        }
	        int ans = findMin(nums);
	        System.out.println(ans);

	}

}
