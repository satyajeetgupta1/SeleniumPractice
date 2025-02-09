package brokenLinks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakethediffeentWindowtitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
       //List<WebElement> links = driver.findElements(By.cssSelector("#gf-BIG .gf-li"));
		//System.out.println(links.size());
		WebElement footerdriver =driver.findElement(By.id("gf-BIG"));
		WebElement columnDriver =footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		//List<WebElement> links = columnDriver.findElements(By.tagName("a"));
		List<WebElement> links = footerdriver.findElements(By.tagName("a"));
		
		for(WebElement link:links)
		{
			String openInNewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			link.sendKeys(openInNewtab);
			//Thread.sleep(5000);
				
		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		 while(it.hasNext())
		 {
			
			 System.out.println(driver.switchTo().window(it.next()).getTitle());
		 }

	}

}
