package assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderArrayList {

	public static void main(String[] args) {
		
        ArrayList<String>list = new ArrayList<String>();
  
        list.add("Geeks");
        list.add("For");
        list.add("ForGeeks");
        list.add("GeeksForGeeks");
        list.add("A computer portal");
  
        System.out.println("Unsorted ArrayList: "
                           + list);
  
      
        Collections.sort(list, Collections.reverseOrder());
  
        System.out.println("Sorted ArrayList "
                           + "in Descending order : "
                           + list);
	}

}
