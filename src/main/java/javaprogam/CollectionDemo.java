package javaprogam;

import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a= {4,5,4,6,7,4,5,6,4,5,6,9};
     HashMap<Integer,Integer> hm=new HashMap();
     for( int i:a) {
    	 if (hm.containsKey(i)) {
    		 hm.put(i,hm.get(i)+1);
    	 }
    	 else {
    		 hm.put(i, 1);
    	 }
    	 
     }
   System.out.println(hm);
     
    
	}
	}


