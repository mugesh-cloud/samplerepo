package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		boolean displayed = driver.findElement(By.id("slider")).isDisplayed();
		System.out.println(displayed);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();
		boolean displayed1 = driver.findElement(By.id("form")).isDisplayed();
		System.out.println(displayed1);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("mugeshkirsh@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Mugesh");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		Thread.sleep(2000);
		boolean displayed2 = driver.findElement(By.xpath("//*[@id='form']/div/div")).isDisplayed();
		System.out.println(displayed2);
		WebElement mrradio =driver.findElement(By.cssSelector("[value='Mr']"));
		mrradio.click();
		driver.findElement(By.id("password")).sendKeys("12345678");
		WebElement dropdown= driver.findElement(By.id("days"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("26");
		WebElement drop= driver.findElement(By.id("months"));
		Select se=new Select(drop);
		se.selectByValue("8");
		WebElement dr = driver.findElement(By.id("years"));
		Select s= new Select(dr);
		s.selectByValue("1995");
		Thread.sleep(2000);
		WebElement checkletter =driver.findElement(By.xpath("//*[@id='newsletter']"));
		checkletter.click();
		WebElement  opt= driver.findElement(By.xpath("//*[@id='optin']"));
		opt.click();
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("mugesh");
		driver.findElement(By.id("last_name")).sendKeys("ravi");
		driver.findElement(By.id("company")).sendKeys("axess tech");
		driver.findElement(By.id("address1")).sendKeys("42,mettupalayam(po)");
		driver.findElement(By.id("address2")).sendKeys("musiri");
		Thread.sleep(2000);
		WebElement co=driver.findElement(By.id("country"));
		Select a=new Select(co);
		a.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.findElement(By.id("state")).sendKeys("Tamilnadu");
		driver.findElement(By.id("city")).sendKeys("Trichy");
		driver.findElement(By.id("zipcode")).sendKeys("621210");
		driver.findElement(By.id("mobile_number")).sendKeys("6369770346");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		Thread.sleep(2000);
		boolean displayed3 = driver.findElement(By.xpath("//section[@id='form']/div/div")).isDisplayed();
		System.out.println(displayed3);
		
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		Thread.sleep(2000);
		boolean displayed4 = driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();
		System.out.println(displayed4);
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		
		boolean displayed6 = driver.findElement(By.xpath("//div[@class='row']/div/h2")).isDisplayed();
		System.out.println(displayed6);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		
	}

}
