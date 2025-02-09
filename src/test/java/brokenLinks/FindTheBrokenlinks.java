package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
//import org.testng.asserts.SoftAssert;
public class FindTheBrokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		SoftAssert a = new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		//SoftAssert a =new SoftAssert();


		for(WebElement link:links)
		{
			String url = link.getDomAttribute("href");
		//URL ur = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection(); //new URL(url).openConnection();
		conn.connect();
		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);
		
//		if(responseCode>400)
//		{
//			System.out.println("Link is broken with response code "+ responseCode);
//		}
		
		}
		driver.quit();
		

	}

}
