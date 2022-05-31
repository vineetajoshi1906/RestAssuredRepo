package javaprogam;

public class StaticDemo {
	
	String name;
	String address;
	static String city="Banglore";
	static int i=0;
	public StaticDemo() {
		
	}

	public StaticDemo(String name, String address) {
		this.name=name;
		this.address=address;
		this.city=city;
		i++;
		System.out.println(i);
		
	}
	public void getAddress() {
		System.out.println(address +","+city);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd=new StaticDemo("Bob","Marthalli");
		StaticDemo sd1=new StaticDemo("Vineeta","Vasundhara");
		sd.getAddress();
		sd1.getAddress();


	}

}
