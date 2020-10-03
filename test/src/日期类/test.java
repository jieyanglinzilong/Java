package »’∆⁄¿‡;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class test {

	public static void main(String[] args) {
		Calendar ca=Calendar.getInstance();
		int year=ca.get(Calendar.YEAR);
		System.out.println(year);
		ca.set(2019,8,2);
		long time1=ca.getTimeInMillis();
		ca.set(2019,8,15);
		long time2=ca.getTimeInMillis();
		time1=(time2-time1)/(1000*60*60*24);
		String s=String.format(Locale.JAPAN,"%tA(%<tF)" ,new Date());
		
		System.out.println(time1+" "+s);
		// TODO Auto-generated method stub

	}

}
