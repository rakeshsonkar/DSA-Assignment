package assignment6;

public class ReverseWave {
	static void RWave(int direction,int top, int bottom, int left, int right, int[][] arr) {
		while(left<=right) {
			if(direction%2!=0) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
			else{
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		RWave(1,0,arr.length-1,0,arr[0].length-1,arr);
	}

}
