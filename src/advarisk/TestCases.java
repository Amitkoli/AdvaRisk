package advarisk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch The Browser
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\RJ\\Desktop\\SALLENIUM\\Chrome jar\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver	driver = new ChromeDriver();
		
		//2. Enter the URL
		
		driver.get("https://www.saucedemo.com/");
		
		//3. Maximize the window
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//4. Check the current URL (getting Valid or Invalid)
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//5. Check the current Title (getting Valid or Invalid)
		
		String expectedTitle="Swag Labs";
		String Title = driver.getTitle();
		System.out.println(Title);
		if (expectedTitle.equalsIgnoreCase(Title)) {
		System.out.println("Testcase is passed");
	}else {
		System.out.println("Testcase is failed");
	}	
		
		//is dispayed.
		
		//6. Check the UserName Status
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		System.out.println("Username id status "+ Username.isDisplayed());
				
		//7. Check the Password Status
				
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		System.out.println("Password status "+Password.isDisplayed());
				
		//8. Enter The UserName and Password
		
		WebElement Username1 = driver.findElement(By.xpath("//input[@id='user-name']"));
		//Username.sendKeys("standard_user");
		
		System.out.println(Username1.isEnabled());  // boolean value. // true //false.
	     if(Username1.isEnabled()==true) {
	     Username1.sendKeys("standard_user");
	       }else {
				System.out.println("The element is not intractable");
			}
	     
	     WebElement Password1 = driver.findElement(By.xpath("//input[@id='password']"));
			
	 	//Password.sendKeys("secret_sauce");
	 	    System.out.println(Password1.isEnabled());  // boolean value. // true //false.
	         if(Password1.isEnabled()==true) {
	         	Password1.sendKeys("secret_sauce");
	 		  }else {
	 	System.out.println("The element is not intractable");
	 		   }
	         
//	 		if (driver.getCurrentUrl().equals(url)) {
//	 		System.out.println("Login Suceesfull");
//	 			
//	 			
//	 		} else {
//	 		System.out.println("Username and password do not match any user in this service.");
//	 			
//	 			
//	 		} 
	         
	      //9. Click on the Login Button and check button Functionality working Properly or Not
	         
	 		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
			
			login.click();
			
			//10. Check the Footerlink and its Size and Value as per the requirements
			
			List<WebElement> Footellink = driver.findElements(By.xpath("//footer[@class='footer']/ul/li/a"));
			System.out.println("Footellink Size is "+Footellink.size());
				for (int i=0; i<Footellink.size();i++) {
				String Footellinks = Footellink.get(i).getAttribute("href");
				System.out.println(i+" "+Footellinks);
			}
				
			//11. Check the Filter option working Properly or not
				
		//WebElement Productcontainer = driver.findElement(By.xpath("//span[@class='active_option']"));
				WebElement Productcontainer = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
				Thread.sleep(8000);
				Productcontainer.click();
				
			//12. Check the OpenMenu option open Properly or not
				
				WebElement Button = driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
				Thread.sleep(8000);
				Button.click();
				
			//13. Check the OpenMenu option Close Properly or not
				
				WebElement Button1 = driver.findElement(By.xpath("//button[text()='Close Menu']"));
				Thread.sleep(8000);
				Button1.click();
				
				
			//14. Check the Available Product Size showing Properly or not
				
			//List<WebElement> Product = driver.findElements(By.xpath("//div[@id='inventory_container']/div/div/div[1]"));
			List<WebElement> Product = driver.findElements(By.xpath("//div[@class='inventory_container']/div/div"));
			
			//div[@class='inventory_list']/div
			System.out.println("Product Size is "+ Product.size());
			
			//15. Verify User can able to Add product into Cart properly or not
			
			WebElement Add = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
			
			Add.click();
			Thread.sleep(8000);
			
			//16. Verify User can able to Remove product from Cart properly or not
			
			//WebElement Remove = driver.findElement(By.xpath("//button[text()='Remove']"));
			//Remove.click();
			
			//17. Verify Added products showing properly into the Cart and check Cart working functionality
			
			WebElement Cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
			Cart.click();
			Thread.sleep(8000);
			
			//18. Verify chosing Product Quantity and Price if right then check user can able click on checkout button
			
			WebElement Checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
			Checkout.click();
			
			//19. verify after clicking on checkout button User can able to enter there Information
			//(also verify if and mentioned details missing then any error generated or not)
			
			WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			FirstName.sendKeys("Amit");
			
			WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			LastName.sendKeys("Koli");
			WebElement Zipcode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
			Zipcode.sendKeys("40088");
			Thread.sleep(8000);
			
			//20. verify user can able to click on Continue button or not. check Button functionality
			
			WebElement OK = driver.findElement(By.xpath("//input[@data-test='continue']"));
			OK.click();
			
			//21. verify user can able to click on Cancel button or not. check Button functionality
			//(User want to cancel there order that we check Cancel Button functionality working properly or not)
			
			//WebElement Cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
			//Cancel.click();
			
			//21. verify user can able to click on Finish button or not. check Button functionality
			
			WebElement Finish = driver.findElement(By.xpath("//button[text()='Finish']"));
			Finish.click();
			
			//22. verify after the Order complete PopUp comes or not('Thank you for your order!) 
			
		

	}

}
