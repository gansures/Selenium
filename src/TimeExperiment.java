import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeExperiment {
	
	public static String getCurrentDate() {
	DateFormat d = new SimpleDateFormat("ddMMyyy_HHmmss");
	//Date date = new Date();
	Calendar c = Calendar.getInstance();
	return d.format(c.getTime());
	}
@BeforeSuite
	public static void getCurrentDy() {
		DateFormat d = new SimpleDateFormat("ddMMyyy_HHmmss");
		//Date date = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println("before test from another class");
		}
}
