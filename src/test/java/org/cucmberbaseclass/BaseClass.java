package org.cucmberbaseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BaseClass {
	public static WebDriver driver;
	//To Launch a Browser
	public static void browserLaunch() {
	driver=new ChromeDriver();
	}
	 //To launch a particular website
	public static void launchUrl(String url) {
		driver.get(url);
		
		
	}
	//To get a website title
	public static String pageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;

	}
	public static String pageUrl() {
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		return url;

	}
	public static void closeBrowser() {
		driver.close();

	}
	
	
	//to fill the text
	public static void fillText(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	//to fill the password
	public static void loginPassword(WebElement password,String values) {
		password.sendKeys(values);

	}
	//submit button
	public static void loginButton(WebElement loginclick) {
		
         loginclick.click();
	}
	//if we need a screenshot it click the screen shot
	public static void takeScreenShot(String s) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
        File src=tk.getScreenshotAs(OutputType.FILE);
        File f=new File("C:\\Users\\Kayira\\eclipse-workspace\\MavenFirstProject\\ScreenShot\\"+s+".jpg");
        FileUtils.copyFile(src, f);
	}
	//it create a movetoElement
	public static void mouseOver(WebElement mouse) {
     Actions a1=new Actions(driver);
     a1.moveToElement(mouse).perform();
	}
	//it used to drag and drop
	public static void dragDrop(WebElement drag1,WebElement drop1) {
		 Actions a=new Actions(driver);
		 a.dragAndDrop(drag1, drop1).perform();

	}
	public static void javaScript(WebElement email,String value1,WebElement password,String value2,WebElement login) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+value1+"')", email);
		js.executeScript("arguments[0].setAttribute('value','"+value2+"')", password);
		js.executeScript("arguments[0].click()",login);

	}
    public static String getDriven(int rowNo,int cellNo,String sheetName) throws IOException {
		File f=new File("C:\\Users\\Kayira\\eclipse-workspace\\MavenFirstProject\\Excel\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh=book.getSheet(sheetName);
		Row r=sh.getRow(rowNo);
		Cell c=r.getCell(cellNo);
		CellType type=c.getCellType();
		 int value=type.ordinal();
		 String name="";
		 if(value==2)
		 {
			 name=c.getStringCellValue();
			 System.out.println(name);
		 }
		 else if (DateUtil.isCellDateFormatted(c)) {
			 Date d=c.getDateCellValue();
			 SimpleDateFormat sim=new SimpleDateFormat("ddMMMYY");
			 name=sim.format(d);
			 System.out.println(name);
		}
		 else {
			 double da=c.getNumericCellValue();
			 long a=(long)da;
			 name=String.valueOf(a);
			 System.out.println(name);
		 }
		
    	
    	return name;
		

	}
}
