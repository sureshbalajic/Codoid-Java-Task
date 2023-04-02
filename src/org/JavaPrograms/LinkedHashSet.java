package org.JavaPrograms;
import java.util.Set;
public class LinkedHashSet {
	

	
	    public static void main(String[] args) {
	        LinkedHashSet set = new LinkedHashSet();
	        
	        // Adding elements to the set
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Banana");
	        set.add("Durian");
	        
	        // Printing the set
	        System.out.println(set);
	        
	        // Removing an element from the set
	        set.remove("Banana");
	        System.out.println(set);
	        
	        // Checking if an element is in the set
	        if (set.contains("Apple")) {
	            System.out.println("Set contains Apple");
	        } else {
	            System.out.println("Set does not contain Apple");
	        }
	        
	     
	    }

		private boolean contains(String string) {
			// TODO Auto-generated method stub
			return false;
		}

		private void add(String string) {
			// TODO Auto-generated method stub
			
		}

		private void remove(String string) {
			// TODO Auto-generated method stub
			
		}
	

}


