package javaprogam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
    Date d=new Date();
    System.out.println(d.toString());
    SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
    System.out.println(sdf.format(d));
	}

}
