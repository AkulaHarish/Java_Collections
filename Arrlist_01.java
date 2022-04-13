import java.util.ArrayList;

public class Arrlist_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar=new ArrayList<Object>(10);
		ar.add(100);
		ar.add("Harish");
		ar.add(102.22);
		System.out.println(ar);
		System.out.println(ar.get(0));
		//arr.addAll(15, arr1);
		
		//System.out.println(ar.addAll(1));
		System.out.println();
		//System.out.println(ar.get(1));
		//System.out.print("Hari");
		
		//ITERATING THE ARRAYLIST 
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
