package First.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.logging.LogManager;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import lombok.extern.log4j.Log4j;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class AppTest{

ExtentReports extent;

//logger

//private static Logger log=LogManager.getLogger(AppTest.class.getName());

@BeforeTest

public void config()

{

// ExtentReports , ExtentSparkReporter

String path =System.getProperty("user.dir")+"\\reports\\index.html";

ExtentSparkReporter reporter = new ExtentSparkReporter(path);

reporter.config().setReportName("Web Automation Results");

reporter.config().setDocumentTitle("Test Results");

extent =new ExtentReports();

extent.attachReporter(reporter);

extent.setSystemInfo("Tester", "Rahul Shetty");

}

@Test(dataProvider="Testdata")

public void initialDemo(String data1, String data2)

{

ExtentTest test= extent.createTest("Initial Demo");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Kumar Nayak\\Desktop\\Automation Tutorial\\Selenium\\Selenium chrome driver\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get(data1);

System.out.println(driver.getTitle());

driver.close();

//test.fail("Result do not match");

extent.flush();

}

@DataProvider
public  Object[][] Testdata ()
{
	
Object[][] data=new Object[1][2];
data[0][0]="https://www.google.com";
data[0][1]="title";

return data;
}









}