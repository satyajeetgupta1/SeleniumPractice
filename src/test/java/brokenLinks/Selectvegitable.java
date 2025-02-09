package brokenLinks;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectvegitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> listOfvegi = driver.findElements(By.cssSelector(".products>.product"));
		System.out.println(listOfvegi.size());
		List<WebElement> vegiNames = driver.findElements(By.cssSelector("h4.product-name"));
		String[] requiredvegi = {"Brocolli","Potato","Orange"};
		 for(int i=0;i<vegiNames.size(); i++ )
		 {
			String formattedname =  listOfvegi.get(i).getText().split("-")[0].trim();
			List<String> vegiList = Arrays.asList(requiredvegi);
			 
			if(vegiList.contains(formattedname))
			{
				listOfvegi.get(i).findElement(By.cssSelector(".product-action button")).click();
			}
		 }

	}

}
