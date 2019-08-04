import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TerenarySwitch {
	
	TimeExperiment t = new TimeExperiment();
	@BeforeTest
	public void dain() {
		int b=2, c=4;
		 int d = b>c?pass():fail();
		 System.out.println(d);
		/*
		 * switch (b) { case 1: case 2: case 3: default: }
		 */
	}
	@BeforeTest
	public int pass()
	{
		System.out.println("pass");
		return 1;
	}
	public int fail()
	{
		System.out.println("fail");
		return 2;
	}
	public void switchMethod()
	{
		int a=2;	
		switch (a) {
		case 1:System.out.println("fail");
		case 2:System.out.println("pass");
			break;
		case 3:System.out.println("fail");
			default: System.out.println("fuck off");
		}
		}
	@Test
	public void fass1()
	{
		System.out.println("pass");
		System.out.println(t.getCurrentDate());
	}
}
