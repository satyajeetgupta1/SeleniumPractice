package brokenLinks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrolltheWindoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,5000)");
	
	//js.executeScript("document.querySelector(".tableFixHead").scrollTop=5000");

	}

}
