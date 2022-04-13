import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLIst_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Using  sort and equals
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","b","c","d","f"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","b","c","d","e"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","b","c","d","f"));
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));//false
		Collections.sort(l3);
		System.out.println(l1.equals(l3));//true
		
		
		
		//2..compare two list-find out the additional element:
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","b","c","d","f"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A","b","c","d","e"));
		//l4.removeAll(l5);
		//System.out.println(l4);
		
		//3.find out the missing element 
		l5.removeAll(l4);
		System.out.println(l5);
		
		//4.find out the common 
		
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("java","php","c","cpp","python"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("java","php","c","cpp","ruby"));
	     lang1.retainAll(lang2);
	     System.out.println(lang1);
	}

}
