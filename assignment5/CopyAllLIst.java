package assignment5;

import java.util.ArrayList;

public class CopyAllLIst {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//inbuilt
		//List<Integer> list2 = new ArrayList<>(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i: list) {
			list2.add(i);
		}
		System.out.println(list2);
	}

}
