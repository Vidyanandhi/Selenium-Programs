package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//step1: setup the path of the properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		//step2: Create object for Properties class
		Properties prop = new Properties();
		//step3: load the properties file
		prop.load(fis);
		
		//step4: to read the property
		System.out.println(prop.getProperty("username"));
	
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get(prop.getProperty("url"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		 * driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * driver.findElement(By.linkText("CRM/SFA")).click();
		 * driver.findElement(By.linkText("Leads")).click();
		 * driver.findElement(By.linkText("Create Lead")).click();
		 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99")
		 * ; driver.findElement(By.name("submitButton")).click(); String text =
		 * driver.findElement(By.id("viewLead_companyName_sp")).getText(); String id=
		 * text.replaceAll("\\D", ""); //to save data into properties file
		 * FileOutputStream fos = new
		 * FileOutputStream("./src/main/resources/config.properties");
		 * prop.setProperty("leadId", id); prop.store(fos, "Updating leadId");
		 * 
		 */
	}

}
