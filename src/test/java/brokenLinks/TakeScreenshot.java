package brokenLinks;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
  //get full page screenshot		
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\JeetSelenium\\PawanLearning\\Screenshot\\image.png"));
	
	//get specific page screenshot
	WebElement rlogo = driver.findElement(By.cssSelector("img[class='logoClass']"));
	File rahulLogo = rlogo.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(rahulLogo, new File("E:\\JeetSelenium\\PawanLearning\\Screenshot\\rahulWeblogo.png"));
		
		

	}

}
