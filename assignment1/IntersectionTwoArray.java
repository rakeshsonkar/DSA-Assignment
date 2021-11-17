package assignment1;
import java.util.*;
public class IntersectionTwoArray {
	public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0, index2 = 0;
        Set<Integer> set = new HashSet<>();
        while(index1 < nums1.length && index2 < nums2.length){
            int a = nums1[index1++], b = nums2[index2++];
            System.out.println(a + " " +b);
            if(a == b){
                set.add(a);
            }else if(a < b){
                index2--;
            }else
                index1--;
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int num : set)
            res[i++] = num;
        return res;
    }
	    
	public static void main(String[] args) {
		int []nums1 = {1,2,2,1};
		int []nums2 = {2,2};
	int[] arary = intersection(nums1,nums2);
	for(int a: arary) {
		System.out.println(a);
	}
		
	}

}
