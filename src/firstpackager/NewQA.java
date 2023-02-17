package firstpackager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class NewQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.getProperty("webdriver.chrome.driver","<ChromeDriver_Path>/chromedriver"); //Used chromedriver
        String baseUrl = "https://web.neobank.one/auth/login";
        
        ChromeDriver driver = new ChromeDriver(); //Create an instance of the class
        driver.get(baseUrl); //Use the GET method to open the url
        
        TimeUnit.SECONDS.sleep(3); //Waiting for the page to load
        
        if(driver.getTitle().contains("NEOBANK для бізнесу")) {
        	System.out.println("Title valid ");
        }
        else {
        	System.out.println("Title not valid");
        }
        		
        driver.findElement(By.id("login")).sendKeys("63 690 16 99"); //Writing a phone number
        driver.findElement(By.className("btn-primary")).click(); //Click button "Continue"
        
        driver.manage().window().maximize(); //Open the window to full screen
        
        TimeUnit.SECONDS.sleep(5);//Waiting
		driver.quit();//Close the window
	}

}



