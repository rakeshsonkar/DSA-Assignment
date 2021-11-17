package assignment2;

public class Majority2 {
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2) return nums[index];
        return -1;
     }
	public static void main(String[] args) {
		int [] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}

}
