package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("button.oxd-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class ='oxd-main-menu-item active']")).click();
	driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")).click();
	Thread.sleep(2000);
	
	
//	TakesScreenshot ts = (TakesScreenshot)driver;
//	File f = ts.getScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\SD003\\target\\screenshot.png");
//	FileUtils.copyFile(f, dest);
	
	driver.close();
}
}
