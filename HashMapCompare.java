import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> Hmap0 = new HashMap<Integer, String>();
		Hmap0.put(1, "Harish");
		Hmap0.put(2, "Joseph");
		Hmap0.put(3, "Stephen");
			
		HashMap<Integer, String> Hmap1 = new HashMap<Integer, String>();
			Hmap1.put(3, "Stephen");
			Hmap1.put(2, "Joseph");
			Hmap1.put(1, "Harish");
			
		HashMap<Integer, String> Hmap2 = new HashMap<Integer, String>();
			Hmap2.put(3, "Stephen11");
			Hmap2.put(2, "Joseph");
			Hmap2.put(1, "Harish");	
		//1.On the basis of key-value: use equals mathod	
		System.out.println(Hmap0.equals(Hmap1));//returns true
		System.out.println(Hmap1.equals(Hmap2));//returns false
		
		
		// How will you compare two HashMap for the same keys, for that we can use keySet() method:
		
		System.out.println(Hmap0.keySet().equals(Hmap1.keySet()));//returns true
		System.out.println(Hmap0.keySet().equals(Hmap2.keySet()));//returns false

	   // Finding put the extra keys:
		HashMap<Integer, String> Hmap3 = new HashMap<Integer, String>();
		Hmap3.put(1, "Harish");
		Hmap3.put(2, "Joseph");
		Hmap3.put(3, "Stephen");
		Hmap3.put(4, "Step");
		//Combine the keys from both maps: by using HashSet:
		HashSet<Integer> combinKeys = new HashSet<Integer>(Hmap0.keySet());
		//Adding the keySet from Hmap3:
		combinKeys.addAll(Hmap3.keySet());
		combinKeys.removeAll(Hmap0.keySet());
		System.out.println(combinKeys);
		

	
	
	}

}
