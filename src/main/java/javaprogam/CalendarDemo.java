
package javaprogam;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cd=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println(sdf.format(cd.getTime()));
		System.out.println(cd.get(Calendar.DAY_OF_WEEK));
		System.out.println(cd.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cd.get(Calendar.DAY_OF_MONTH));


	}

}
