package testSel.testSelenium;

//Importing required classes
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
 // Main driver method
 public static void main(String args[])
 {
     System.setProperty(
         "webdriver.chrome.driver",
//         "C:\\Users\\afree\\Downloads\\chromedriver_win32\\chromedriver.exe");
         "C:\\Users\\afree\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

     ChromeDriver driver = new ChromeDriver();

     // Maximize the browser
     // using maximize() method
     driver.manage().window().maximize();

     // Launching website
     driver.get("https://www.geeksforgeeks.org/");
     
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("login1")).sendKeys("afreenshaik");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("pwd123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("remember")).click();
//		driver.findElement(By.name("proceed")).click();
     driver.close();
 }
}