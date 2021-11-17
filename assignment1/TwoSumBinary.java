package assignment1;

import java.util.Arrays;

public class TwoSumBinary {
	
	static int[] TwoBinary(int numbers[],int target) {
		int len = numbers.length;
        int low = 0, high = len - 1;
        int sum = numbers[low] + numbers[high];
        while(sum != target){
            if(sum < target) low++;
            else high--;
            sum = numbers[low] + numbers[high];
        }
        return new int[]{low + 1, high + 1};
	}

	public static void main(String[] args) {
		int [] numbers= {2,7,11,15};
			int target = 9;
			System.out.println(Arrays.toString(TwoBinary(numbers,target)));
	}

}
