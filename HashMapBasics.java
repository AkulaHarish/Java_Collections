import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> cMap = new HashMap<String, String>();
				/* Key *//* Value  */
		cMap.put("India", "Delhi");
	    cMap.put("US", "Washington DC");
	    cMap.put("UK", "London");
	    cMap.put("UK", "London111");
	    System.out.println(cMap.get("India"));
	    System.out.println(cMap.get("UK"));
	    
	    //iterator:
	    Iterator<String> it =cMap.keySet().iterator();
	    
	    while(it.hasNext()) {
	    	String key= it.next();
	    	String value=cMap.get(key);
	    	System.out.println("key=" +key+  "value=" + value);
	    }
	    
	    System.out.println();
	    //Instead of while lopp we can use java8 feature
	    cMap.forEach((v,k)->System.out.println("key=" +k+ "and value="+v));
	}
} 
