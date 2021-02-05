package Qsp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class Datetwo {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat s1=new SimpleDateFormat("d");
		String day=s1.format(date);
		System.out.println(day);
		SimpleDateFormat s2=new SimpleDateFormat("MM");
		String month=s2.format(date);
		System.out.println(month);
		SimpleDateFormat s3=new SimpleDateFormat("YYYY");
		String year=s3.format(date);
		System.out.println(year);
	LocalDate today=LocalDate.now();
	System.out.println(today);
	LocalDate tomorrow=today.plusDays(1);
	System.out.println(tomorrow);
	LocalDate week=today.plusWeeks(2);
	System.out.println(week);
			
	

	}

}
