package javaprogam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		hm.put(0,"Banglore");
		hm.put(41,"Pune");
		hm.put(2,"Mumbai");
		hm.put(13,"Delhi");
        System.out.println(hm.get(13));
        System.out.println(hm.remove(0));
        System.out.println(hm.get(0));
        Set sn=hm.entrySet();
        Iterator i=sn.iterator();
        while(i.hasNext()) {
        	Map.Entry mp=(Map.Entry)i.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());

        }
        

	}

}
