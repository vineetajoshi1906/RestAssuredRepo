package javaprogam;

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo ad=new ExceptionDemo();
		int a=4;
		int b=0;
		try {
			
			int k=a/b;
			System.out.println(k);
		} 
		catch (Exception e) {

		System.out.println("error captured");
		}
		    
	}

}
