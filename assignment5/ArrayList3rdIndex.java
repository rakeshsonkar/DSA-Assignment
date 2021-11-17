package assignment5;

import java.util.ArrayList;

public class ArrayList3rdIndex {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Before Replacing");
		System.out.println(list);
		
		list.set(2, 500);
		
		System.out.println("After Replacing");
		System.out.println(list);
	}

}
