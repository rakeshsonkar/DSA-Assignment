package assignment15Nov;
public class  SearchingSortRotated{

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
				
		int target=3;
		System.out.print(search(nums,target));
		
	}
		// TODO Auto-generated method stub
		   public static int search(int[] nums, int target) {
		       int left=0;
		       int right=nums.length-1;
		       while(left<=right)
		       {
		    	   int mid=left+(right-left)/2;
		    	   if(nums[mid]==target)
		    	   {
		    		   return mid;
		    	   }
		    	   else if(nums[left]<=nums[mid])
		    	   {   
		    		   if(nums[left]<=target&& nums[mid]>target)
		    		   {
		    			   right=mid-1;
		    		   }
		    		   else
		    			   left=mid+1;
		    		  
		    			   
		    	   }
		    	   else
		    	   {
		    		   if(nums[mid]<target && nums[right]>=target)
		    		   {
		    			   left=mid+1;
		    		   }
		    		   else
		    			   right=mid-1;
		    	   }
		       }
		       return -1;    
	}
}
