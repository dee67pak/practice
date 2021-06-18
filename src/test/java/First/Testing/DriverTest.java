package First.Testing;

import java.io.IOException;

import org.testng.annotations.Test;
import Base.DriverInitialization;

public class DriverTest extends DriverInitialization 
{
	@Test
	public void test() throws IOException
	{
		driver=initialize();
		driver.get("https://www.google.com/");
	}
	
	

}
