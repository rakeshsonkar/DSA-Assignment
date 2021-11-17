package assignment1;

	public class BinarySearchBasic {
		//public int search(int[] nums, int target) {
//		    int low = 0;
//		    int high = nums.length-1;
//		    
//		    while(low <= high){
//		       int mid = low +(high-low)/2;
//		        if(nums[mid]== target) return mid;
//		        else if(target<nums[mid]) high = mid-1;
//				else low = mid+1;
//		    }
//		    return -1;
//		}
static int binary_search(int []arr ,int target) {
				int low =0;
				int high = arr.length-1;
				while(low<=high) {
					int mid = (low+high)/2;
					if(arr[mid]==target) {
						return mid;
					}else if(arr[mid]>target) {
						high=mid-1;
					}else {
						low=mid+1;
					}
				}
				//if(low>high) return -1;
			//	if(low==arr.length || high<0)return -1;
				return -1;
				
			}
	public static void main(String[] args) {
		int arr []= {2,4,8,10,11,13,14};
		System.out.println(binary_search(arr,13));

	}

}
