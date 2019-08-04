import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prac1 {
	TimeExperiment time = new TimeExperiment();

	public void main() {
		//HashMap<String, Float> hm = new HashMap<String, Float>();
		Hashtable<String, Float> hm = new Hashtable<String, Float>();
		hm.put("a", (float) 22.2);
		System.out.println(hm.size());
		hm.putIfAbsent("a", (float)22.2);
		Set<Entry<String, Float>> set = hm.entrySet();
		System.out.println(set);
		String m = null;
		while (set.iterator().hasNext()) {
			Entry<String, Float> b = set.iterator().next();
			if (b.getValue() == (float)22.2) {
				m = b.getKey();
				break;
			}
		}
		System.out.println(m);
		System.out.println(time.getCurrentDate());
			}

}