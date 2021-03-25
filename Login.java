package TutorialNinjaSelenium;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  


public class Login {

	public static void main(String[] args) {
	
		//To provide location for Chromedriver
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Test\\chromedriver.exe");  
	    
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://tutorialsninja.com/demo/index.php");
	    driver.manage().window().maximize();
	   
	    driver.findElement(By.xpath("//a[@title='My Account']"));
	    WebElement MyAccount=driver.findElement(By.xpath("//a[@title='My Account']"));
	    MyAccount.click();
	    
	    //Select Login from dropdown
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
	    WebElement Login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
	    Login.click();
	    
	    //Fill details in Returning Customer section
	    driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	    WebElement Email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
	    Email.sendKeys("sctqatest@grr.la");
	    
	    driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	    WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
	    password.sendKeys("Spring123$");
	    
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	    WebElement ClickLogin= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	    ClickLogin.click();
	    
	    driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i"));
	    WebElement Home=driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i"));
	    Home.click();
	    
	    //Navigating to Laptops section
	    
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"));
	    WebElement Laptop=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"));
	    Laptop.click();
	    driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"));
	    WebElement LandN=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"));
	    LandN.click();
	    //Refine search
	    driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
	    WebElement RefineSearch=driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
	    RefineSearch.click();
	    Select drpprice= new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
	    drpprice.selectByIndex(4);  
	   
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a"));
	    WebElement MacPro=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a"));
	    MacPro.click();
	    driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
	    WebElement AddQ=driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
	    AddQ.clear();
	    AddQ.sendKeys("2");
	    driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
	    WebElement Add2Cart=driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
	    Add2Cart.click();
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i"));
	    WebElement ShoppingCart=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i"));
	    ShoppingCart.click();
	    //driver.close();
	    
	    		
	}

}
