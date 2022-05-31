package javaprogam;

public class ThisDemo {
	int a=3;

	public void Displaydata() {
		int a=4;
		System.out.println(a);
		System.out.println(this.a+a);
	}
	public static void main(String[] args) {
     ThisDemo td=new ThisDemo();
     td.Displaydata();
	}

}
