import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IteratorListWebElement extends ScriptHelper{
	
	
	public void Jumbo() {
		TimeExperiment tm = new TimeExperiment();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		ArrayList<String> a = new ArrayList<>();
		List<WebElement> b = driver.findElements(By.xpath("//a[contains(text(),'')]"));
		Iterator<WebElement> i = b.iterator();
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		while(i.hasNext())
		{
			String s = i.next().getText();
			if (!s.isEmpty() && p.matcher(s).find())
			{
			a.add(s);
			System.out.println(s);
			}
		}
		System.out.println(tm.getCurrentDate());
		lambu();
		driver.quit();
	}
	private void lambu ()
	{
	
	}
	

}
