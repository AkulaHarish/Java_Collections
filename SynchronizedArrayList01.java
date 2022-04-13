import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;
public class SynchronizedArrayList01 {

	private static final  CopyOnWriteArrayList<String> empList  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using Collections.sychronizedList() method
		List<String> nameList= Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add("c");
		//System.out.println(nameList.get(0));
		System.out.println("By using Collections.sychronizedList() method");
		
		synchronized (nameList) {
			Iterator<String> it=nameList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		System.out.println();
		System.out.println();
		//by using 2.copyOnWriteArrayList--it is a class :
		System.out.println("by using 2.copyOnWriteArrayList--it is a class :");
	
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Harish");
		empList.add("Stephen");
		empList.add("Remo");
		Iterator<String> it=empList.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
