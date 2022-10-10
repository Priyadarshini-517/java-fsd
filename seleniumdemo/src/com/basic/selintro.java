package com.basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selintro {
public static void main(String[] args) {
	WebDriver web=null;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	web=new ChromeDriver();
	web.get("https://www.simplilearn.com");
	System.out.println(web.getTitle());
	System.out.println(web.getCurrentUrl());
	web.quit();
}
}
