package pack1;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	@Test
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	    ob.get("http://www.google.com");
	ob.quit();
	
}
}
