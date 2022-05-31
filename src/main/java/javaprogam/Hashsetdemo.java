package javaprogam;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new <String>HashSet();

		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Pune");
		hs.add("Banglore");
		hs.add("Lucknow");
		hs.add("Haldwani");
		hs.add("Dehradoon");

		Iterator it= hs.iterator();
		System.out.println(hs);
		while(it.hasNext()) {
		System.out.println(it.next());
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

	}

}
