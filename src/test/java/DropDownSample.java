
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
driver.get("https://adactinhotelapp.com/");
	
    WebElement txtusername = driver.findElement(By.id("username"));
	txtusername.sendKeys("naveen53");
	
	WebElement txtpswd = driver.findElement(By.id("password"));
	txtpswd.sendKeys("C1IZAU");
	
	WebElement btnlogin = driver.findElement(By.id("login"));
	btnlogin.click();
	
	WebElement dDnlocation = driver.findElement(By.id("location"));
	
	Select select = new Select(dDnlocation);
	
	select.selectByIndex(1);
	
	WebElement dDnhotels = driver.findElement(By.id("hotels"));
	
	Select select2 = new Select(dDnhotels);
	
	select2.selectByIndex(1);
	
	WebElement dDnroomtype = driver.findElement(By.id("room_type"));
	
	Select select3 = new Select(dDnroomtype);
	
	select3.selectByIndex(1);
	
	WebElement dDnnoofrooms = driver.findElement(By.id("room_nos"));
	
	Select select9 = new Select(dDnnoofrooms);
	
	select9.selectByIndex(1);
	
	WebElement txtdatepickin = driver.findElement(By.id("datepick_in"));
	
	txtdatepickin.sendKeys("20/02/2022");
	
	WebElement txtdatepickout = driver.findElement(By.id("datepick_out"));
	txtdatepickout.sendKeys("25/02/2022");
	
	WebElement dDnadultperroom = driver.findElement(By.id("adult_room"));
	
	Select select4 = new Select(dDnadultperroom);
	
	select4.selectByIndex(1);
	
	WebElement dDnchildperroom = driver.findElement(By.id("child_room"));
	
	Select select5 = new Select(dDnchildperroom);
	
	select5.selectByIndex(1);
	
	WebElement clcksearch = driver.findElement(By.id("Submit"));
	clcksearch.click();
	
	WebElement clckradiobtn = driver.findElement(By.id("radiobutton_0"));
	clckradiobtn.click();
	
	WebElement clckcontinue = driver.findElement(By.id("continue"));
	clckcontinue.click();
	
	WebElement txtfirstname = driver.findElement(By.id("first_name"));
	txtfirstname.sendKeys("Rakesh");
	
	WebElement txtlastname = driver.findElement(By.id("last_name"));
	txtlastname.sendKeys("E");
	
	WebElement txtaddress = driver.findElement(By.id("address"));
	txtaddress.sendKeys("3/576,parvathy avenue porur");
	
	WebElement txtccno = driver.findElement(By.id("cc_num"));
	txtccno.sendKeys("1254897612354416");
	
	WebElement dDncctype = driver.findElement(By.id("cc_type"));
	Select select6 = new Select(dDncctype);
	select6.selectByIndex(1);
	
	WebElement dDnexpmonth = driver.findElement(By.id("cc_exp_month"));
	Select select7 = new Select(dDnexpmonth);
	select7.selectByIndex(1);
	
	WebElement dDnexpyear = driver.findElement(By.id("cc_exp_year"));
     Select select8 = new Select(dDnexpyear);
     select8.selectByIndex(12);
     
     WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
     txtcvv.sendKeys("478");     
     
     WebElement clckbooknow = driver.findElement(By.id("book_now"));
     clckbooknow.click();
     
    Thread.sleep(10000);
     WebElement printorderid = driver.findElement(By.id("order_no"));
    
     String data = printorderid.getAttribute("value");
     System.out.println(data);
     
     
     
     
     
     
	
	
	
	
	
	
}
}
