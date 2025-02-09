package Greencart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCartProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] reqVegi = {"Cashews","Pears","Strawberry"};
		
		List<WebElement> vegiNames = driver.findElements(By.cssSelector("h4.product-name"));
		
		//implicite wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
		//Fluent wait practice
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
		 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		 String newTab = Keys.chord(Keys.SHIFT, Keys.ENTER);
		 
		for(int i=0; i<vegiNames.size(); i++)
		{
			String formatedVegiName = vegiNames.get(i).getText().split("-")[0].trim();
			List<String> vegiList = Arrays.asList(reqVegi);
			
			if(vegiList.contains(formatedVegiName))
			{
				//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click()
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			
		}

	}

}
