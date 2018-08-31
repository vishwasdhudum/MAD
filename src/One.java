import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver d = new ChromeDriver();
		d.get("https://google.com");
		String v = "vishwas";
		String x = "wAs";
		//System.out.println(v.matches("(.*)wAs(.*)"));
		System.out.println(v.matches("(?i:.*"+x+".*)"));
		//v = v.substring(0,1).
		Two.connectToGmail(d);
		
		
	}

}
