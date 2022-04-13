import java.util.*;

public class Remove_Duplicate_Ele_From_ArrayList06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There are two ways 1. LinkedHashSet 2.JDK8 Streams
	    //By using the LinkedHasSet
		int i=0,sum = 0,  count=1;
		
		public int fun() {
			for(int j=0; j<=count;j++) {
				  sum = sum+a[i];
				  count++;
				  System.out.println(sum);
			  }
		}
		
	  Scanner sc=new Scanner(System.in);
	  int[] a=new int[5];
	  // a=sc.nextInt();
	  for(i=0;i<=a.length;i++) {
		  a[i]=sc.nextInt(); 
	      //System.out.println(a[i]);
	      //
	  }
	  sc.close();
	  fun();
	  
	}
	
}



