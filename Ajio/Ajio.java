package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// Launch the URL https://www.ajio.com/
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO'][@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		
		//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		//Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		// Print the count of the items Found. 
		String itemCount = driver.findElement(By.className("length")).getText();
		System.out.println(itemCount);
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brands = driver.findElements(By.className("brand"));
		System.out.println(brands.size());
		System.out.println("Brands: ");
		for (WebElement values : brands) {
			System.out.println(values.getText());
		}
		
		//Get the list of names of the bags and print it
		List<WebElement> bagname = driver.findElements(By.className("nameCls"));
		System.out.println(bagname.size());
		System.out.println("Bag Name: ");
		for (WebElement bag : bagname) {
			System.out.println(bag.getText());
		}
}
}
