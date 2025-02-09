package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticebrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
		URL a  = new URL(url);
		
		HttpURLConnection conn = (HttpURLConnection) a.openConnection();
		conn.connect();
		int rcode =conn.getResponseCode();
		System.out.println(rcode);
		driver.close();
	}

}
