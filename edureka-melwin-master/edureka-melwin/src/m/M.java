package m;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	String text2="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");  
        /*ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--headless");
        chromeoptions.addArguments("--no-sandbox");
        chromeoptions.addArguments("--disable-dev-shm-usage");
        WebDriver driver=new ChromeDriver();  */
        System.setProperty("webdriver.gecko.driver","/bin/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
        WebDriver driver=new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://34.93.204.174:8080");  
        driver.findElement(By.xpath("//a[@id='About Us']")).click();
        if(text2.equals(driver.findElement(By.xpath("/html[1]/body[1]/p[2]")).getText())&& text1.equals(driver.findElement(By.id("PID-ab2-pg")).getText()))
        {
            System.out.println("\n----------\n\nTEST PASSED\n\n----------\n");

        }else
        {
            System.out.println("\n----------\n\nTEST FAILED\n\n----------\n");

        }
        
        driver.close();

	}

}


