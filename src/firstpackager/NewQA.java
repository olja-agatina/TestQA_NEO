package firstpackager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;

public class NewQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\ide\\chromedriver.exe"); //Used chromedriver
        
        ChromeDriver driver = new ChromeDriver(); //Create an instance of the class
        driver.get("https://web.neobank.one/auth/login"); //Use the GET method to open the url
        
        TimeUnit.SECONDS.sleep(3); //Waiting for the page to load
        
        String a = "NEOBANK для бізнесу"; //Expected title
        String b = driver.getTitle(); //Result name
        if(a.equals(b)) {
        	System.out.println("Title valid "); // Prints true
        }else {
        	System.out.println("Title not valid"); // Prints false
        }
        
        driver.findElement(By.id("login")).sendKeys("63 690 16 99"); //Writing a phone number
        driver.findElement(By.className("btn-primary")).click(); //Click button "Continue"
        
        driver.manage().window().maximize(); //Open the window to full screen
        
        TimeUnit.SECONDS.sleep(5);//Waiting
		driver.quit();//Close the window
	}

}



