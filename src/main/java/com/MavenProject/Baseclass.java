package com.MavenProject;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver S;
	
	public static WebDriver Browserlaunch(String Browse_name) {
		
		if (Browse_name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			S = new ChromeDriver();
			
			S.manage().window().maximize();
			
		}
		
		else if (Browse_name.equalsIgnoreCase("firefox")) {
			

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			S = new ChromeDriver();
			
			S.manage().window().maximize();
			
		}
		
		return S;
		
	}
	
	public static void Url_launch(String url) {
		
		S.get(url);
		
	}
	
	public static  void Input_values(WebElement element,String values) {
		
		element.sendKeys(values);

	}
	
	public static  void Click(WebElement element) {
		
		element.click();
	
	}
	
	public static void Select_by_value (WebElement element, String value) {
		
		Select A = new Select(element);
		
		A.selectByValue(value);
		
	}
	
	public static void Select_by_index(WebElement element, int value) {
		
		Select A = new Select(element);
		
		A.selectByIndex(value);

	}
	
	public static void Select_by_visibletext(WebElement element, String value) {
		
		Select A = new Select(element);
		
		A.selectByVisibleText(value);
	
	}
	
	public static void Clear(WebElement element) {
		
		element.clear();
	
	}
	
	public static void Screen_shot(String location ) throws IOException {
		
		TakesScreenshot B = (TakesScreenshot) S;
		
		File Source = B.getScreenshotAs(OutputType.FILE);
		
		File Target = new File(location);
		
		FileUtils.copyFile(Source, Target);
	
	}
	
	public static void Close() {
		
		S.close();
		
	}
	
	public static void Navigate_to(String Url) {
		
		S.navigate().to(Url);
		
	}
	
	public static void Navigate_back() {
		
		S.navigate().back();
		
	}
	
	public static void Navigate_forward() {
		
		S.navigate().forward();
		
	}
	
	public static void Navigate_refresh() {
		
		S.navigate().refresh();

	}
	
	public static void Alert_accept() {
		
		S.switchTo().alert().accept();
		
	}
	
	public static void Alert_dismiss() {
		
		S.switchTo().alert().dismiss();

	}
	
	public static void Alert_input(String Value) {
		
		S.switchTo().alert().sendKeys(Value);
		
	}
	
	public static void Context_click(WebElement element) {
		
		Actions A = new Actions(S);
		
		A.contextClick(element).build().perform();

	}
	
	public static void Move_to_elementt(WebElement element) {
		
		Actions A = new Actions(S);
		
		A.moveToElement(element).build().perform();
		
	}
	
	public static void Double_click(WebElement element) {
		
		Actions A = new Actions(S);
		
		A.doubleClick(element).build().perform();

	}
	
	public static void Drag_Drop(WebElement element1,WebElement element2) {
		
		Actions A = new Actions(S);
		
		A.dragAndDrop(element1, element2).build().perform();
		
	}
	
	public static void Mouse_click(WebElement element) {
	
		Actions A = new Actions(S);
		
		A.click().build().perform();

	}
	
	public static  void Is_enabled(WebElement element) {
		
		boolean enabled = element.isEnabled();
		
		System.out.println(enabled);
		
	}
	
	public static void Is_displayed(WebElement element) {
		
		boolean displayed = element.isDisplayed();
		
		System.out.println(displayed);

	}
	
	public static void Is_selected(WebElement element) {
		
		boolean selected = element.isSelected();
		
		System.out.println(selected);

	}
	
	public static void Get_title() {
		
		String title = S.getTitle();
		
		System.out.println(title);
	
	}
	
	public static void Get_url() {
		
		String currentUrl = S.getCurrentUrl();
		
		System.out.println(currentUrl);

	}
	
	public static void Is_mutiple(WebElement element) {
		
           Select A = new Select(element);
           
           boolean multiple = A.isMultiple();
           
           System.out.println(multiple);
	
	}
	
	public static void Robot_keyboard(int Value) throws AWTException {
		
		Robot A = new Robot();
		
		A.keyPress(Value);
		
		A.keyRelease(Value);

	}
	
	public static void Implict_wait() {
		
		S.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public static void Frames_element (WebElement element) {
		
		S.switchTo().frame(element);
		
	}
	
	public static void Frames_index(int value) {
		
		S.switchTo().frame(value);
		
	}
	
	public static void Exit_frames() {

		S.switchTo().defaultContent();

	}
	
	public static void Get_first_selected_options(WebElement element) {


		Select A = new Select(element);
		
		WebElement firstSelectedOption = A.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption);

	}
	
	public static void Get_options(WebElement element) {
		
		Select A = new Select(element);
		
		List<WebElement> options = A.getOptions();
		
		for (WebElement All_options : options) {
			
			System.out.println(All_options);
			
		}
		
	}
	
	public static void Get_all_seleced_options(WebElement element) {
		
		Select A = new Select(element);
		
		List<WebElement> allSelectedOptions = A.getAllSelectedOptions();
		
		for (WebElement selectedoptions : allSelectedOptions) {
			
			System.out.println(selectedoptions);
			
		}
	
	}
	
	public static void Get_text(WebElement element) {
		
		String text = element.getText();
		
		System.out.println(text);
		
	}
	
	public static void Check_box(WebElement element) {
		
		element.click();

	}
	
	public static void Radio_button(WebElement element) {
		
		element.click();

	}
		
}
