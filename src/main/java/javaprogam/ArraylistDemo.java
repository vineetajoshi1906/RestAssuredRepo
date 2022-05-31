package javaprogam;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		
	
	ArrayList<String> a= new ArrayList<String>();
	
	a.add("vineeta");
	a.add("Shwta");
	a.add("Swati");
	System.out.println(a);
	a.remove(2);
	System.out.println(a);
	a.add(0,"Swati");
	System.out.println(a);
	System.out.println(a.get(2));
	System.out.println(a.contains("Swati"));
	System.out.println(a.indexOf("Swati"));
	System.out.println(a.size());
	a.add(3,"Swati");
	System.out.println(a);


}}
